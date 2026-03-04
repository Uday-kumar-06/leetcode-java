import java.util.*;
public class Main
{
    public static void powerSet(int i,String str,String str1){
        if(i == str1.length()){
            System.out.println(str);
            return;
        }
        powerSet(i+1,str+str1.charAt(i),str1);
        
        powerSet(i+1,str,str1);
    }
    
    public static List<List<Integer>> powerSet(int i, int arr [],List<Integer> list,List<List<Integer>> list1){
        if(i == arr.length){
            if(list.size() != 0){
               System.out.println(list.toString());
                list1.add(new ArrayList<>(list));
            }
            return list1;
        }
        list.add(arr[i]);
        powerSet(i+1,arr,list,list1);
        
        list.remove(list.size()-1);
        powerSet(i+1,arr,list,list1);
        
        return list1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		int arr [] = {1,5,3};
		
		powerSet(0,"",str1);
		List<List<Integer>> result = new ArrayList<>();
        powerSet(0, arr, new ArrayList<>(), result);
		
		System.out.println(result.toString());
	}
}
