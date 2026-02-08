import java.util.*;
public class Main
{
    public static void freq(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = {1,2,3,1,5,1,2,6,4,12,4,3};
		freq(arr);
	}
}
