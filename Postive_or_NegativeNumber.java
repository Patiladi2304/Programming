package Basic_Learning;

import java.util.Scanner;

public class Postive_or_NegativeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your number");
	int n=sc.nextInt();
//	if (n>=0) {
//		System.out.println("Postive NUmber ");
//	} else {
//        System.out.println("Negative number ");
//	}
	
	if (n==0) {
		System.out.println("Zero");
	}else {
	
	 String result=(n>0)?("postive"):("negative");
	 System.out.println(result);
	}
}
}
