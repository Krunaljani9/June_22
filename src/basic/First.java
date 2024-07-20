package basic;

import java.util.Scanner;

/*
 * if
 * if else
 * else if
 * nested if
 * if(condition)
 * switch
 * for(init;condition;inc/dec){
 * TRUE
 * }
 * while(condition)
 * */
public class First {
	
	void printArray(int arr[]) {
		for(int i:arr) {
			System.out.println(i);
			}
	}
	
	
	public static void main(String ar[]) {
		
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		
		First obj=new First();
		obj.printArray(a);
		obj.printArray(b);
	
		
		
		
		
		System.out.println("Rest of the code");
	}
		
}
