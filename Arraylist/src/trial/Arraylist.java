package trial;
import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("enter a number:");
		//int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
        int i= arr.size();
        System.out.println(i); 
        arr.add(11);
        System.out.println(arr);
        arr.add(22);
        System.out.println(arr);
        arr.add(33);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.set(0, 14);
        System.out.println(arr);
        ArrayList<Integer> arr1=new ArrayList<>();
        int j=0;
        while(j<=10) {
          arr1.add(j);
          j++;
	}
        System.out.println(arr1);
        int a=0;
        while(a<=5) {
            arr1.remove(0);
            a++;
  	}
          System.out.println(arr1);
	}
}