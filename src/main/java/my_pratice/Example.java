package my_pratice;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 int num=sc.nextInt();
		 
		/* if(num%2 ==0)
		 {
			 System.out.println("number is even");
		 }else
		 {
			 System.out.println("number is odd"); 
		 }
*/
		 int rem ,res=0;
		 
		 
		  
		 while( num>0)
		 {
			 rem=num%10;
			 num=num/10;
			 res=res*10+rem;
		 }
		 System.out.println(res);
		 
		 
		 System.out.println("#######################################");
		 
		 for(int a=1; a<=4;a++)
		 {
			 for(int b=3;b>=a;b--)
			 {
				 System.out.print(" ");
				 
			 }for(int b=0;b<=a-1;b++)
			 {
			 
			 
			 System.out.println("*");
		 }
			 
		 } 
		 
	}

}
