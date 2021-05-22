package trial;
import java.util.ArrayList;
import java.util.Scanner;

public class Primenum {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int count=0;
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(isprime(i)) {
				arr.add(i);
				count++;
			}
		}
		System.out.println("Prime numbers are:");
		System.out.println(arr);
		System.out.println("total prime no. "+count);
}
	public static boolean isprime(int j) {   
		   //if(j<=1) {  
		     //return true;
		//}
		   for(int i=2; i<j ; i++) {
			   if(j%i == 0) {
				   return false;
			   }
		   }
		return true;
	}
}