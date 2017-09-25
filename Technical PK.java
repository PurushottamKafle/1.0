package Technical PK;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Technical PK {
	
	private static Scanner in;
	

	public static void main (String args[]) {
		int x;
		int y, z , p , q, r, passMarks, YourMark;
	String x1;
		passMarks = 40;
		System.out.println("WELCOME TO HelloWorld CalcuS "  );
		System.out.println("******************************");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("*******************************");
		Scanner in = new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("*******************************");
		System.out.println("Please Enter For Multiply");
		x = in.nextInt(); {
			System.out.println("-----You Entered = "+x);
		}
		
		System.out.println("******************************");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("*******************************");
		System.out.println("Please Enter Number For Multiply");
		p = in.nextInt(); {
			System.out.println("-----You Entered = "+p);
		}
		z=x*p;
		System.out.println("Your Answer = " +z);
		
		if(x<p) {
			System.out.println("GO!! Help Your Friend he Is Suffering, ALL GOOD!!!");
		}
		else {
			System.out.println("You SUCKS!!!");
		}
		System.out.println("******************************");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("*******************************");
		System.out.println("Please Enter Number For Multiply");
		y =in.nextInt(); {
			System.out.println("-----You Entered = "+y);
		}
		System.out.println("******************************");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("*******************************");
		System.out.println("Please Enter Number For Add");
		q = in.nextInt();{
			System.out.println("-----You Entered = "+q);
		}
		
		z=y*q;
		System.out.println("Your Answer = " +z);
		
		if(y>q) {
			System.out.println("Today is Good Day For You.. GO!!!");
		}
		else {
			System.out.println("You have BAD LUCK!!! only for TODAY");
		}
		System.out.println("******************************");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("*******************************");
		System.out.println("Please Enter Number For Subtract");
		r = in.nextInt(); {
			System.out.println("-----You Entered = "+r);
		}

		z=z-r;
		System.out.println("Your Answer = " +z);
		
		if(r>q) {
			System.out.println("GO!! EAT from TOILET");
		}
		else {
		System.out.println("You're REAL Human Beings in the 21st Century...");	
		}
		
				z = x*y*p+q-r;
				System.out.println("******************************");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("*******************************");
				if(x>p) {
					System.out.println("CONGRULATIONS YOU GONNA PASS THE EVERY EXAM WITH = " +z);
				}
				else {
					System.out.println("You Should try it again!!!");
				}
				System.out.println("******************************");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("*******************************");
		System.out.println("TOTAL Required Answer = "+z);
		
		/* 
		 * **************
		 *       ***
		 *       ***
		 *       ***
		 *       ***
		 ***********
		 ***********
		 *       
		 * */
		
		
		if(x>y) {
		System.out.println("YOU SUCKS!!!");	
		}
		
		else {
			System.out.println("YOU TO GOOD");
		}
		
		
		
		if(p<q) {
			System.out.println("Fool Whats SUCK!!!");
		}
		else {
			System.out.println("Hey You're Well");
		}
		
	if(z>x){
			
		System.out.println("You're Foolish in the WORLD!!!");	
		}
		else {
			System.out.println("Your Crush LOVE you GO---");
		}
	/*
	 * Check Wheather You pass or fail
	 * 
	 */
	System.out.println("******************************");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("*******************************");
	System.out.println("****************************");
	System.out.println("What's Your Mark in Exam");
	System.out.println("****************************");
	System.out.println(""
			+ "");
	YourMark = in.nextInt();
	System.out.println(""
			+ "");
	System.out.println("****************************");
	if(YourMark>=passMarks) {
		System.out.println("CONTRATULATIONS YOU PASS THIS EXAM with = "+YourMark);
	}
	else {
		System.out.println("Sorry YOU FAILED THIS EXAM!!! with = " +YourMark);
	}
	
	System.out.println("******************************");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("*******************************");

	

	System.out.println("******************************");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("*******************************");
	
	x1 = input();{
		System.out.println("Fooler");
	}
	
	
	}


	private static String input() {
		// TODO Auto-generated method stub
		return null;
	}


	
	


}





