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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		powerSet(0,"",str1);
	}
}
