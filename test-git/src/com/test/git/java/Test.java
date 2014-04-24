package com.test.git.java;

import java.text.*;
import java.util.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello new branch 2 -not able to check out new changes - 10.58");
		System.out.println("successfully created 2nd new branch");
		System.out.println("one more sysout for checkout testing 11.03AM");
		System.out.println("one more sysout 11.50AM  from eclipse-1 confused completely :(");
		System.out.println("Final try 12.48PM");
		System.out.println("final 12.53PM");
		System.out.println("again final 13.10PM");
		System.out.println("hello done with all");
		
		System.out.println("testing calendar");
		DateFormat format = new SimpleDateFormat(   
		        "MMMMM d, yyyy, kk:mm:ss zzz");   
		           
		        TimeZone cst = TimeZone.getTimeZone("MST");   
		        System.out.println(cst.getID());   
		        System.out.println(cst.getRawOffset());   
		           
		        TimeZone utc = TimeZone.getTimeZone("GMT");   
		        System.out.println(utc.getID());   
		        System.out.println(utc.getRawOffset());   
		        
		        {   
		            GregorianCalendar gc = new GregorianCalendar(cst);   
		            Date now = gc.getTime();   
		            format.setTimeZone(cst);   
		            System.out.println(format.format(now));   
		            format.setTimeZone(utc);   
		            System.out.println(format.format(now));   
		        }   
		        {   
		            GregorianCalendar gc = new GregorianCalendar(utc);   
		            Date now = gc.getTime();   
		            format.setTimeZone(cst);   
		            System.out.println(format.format(now));   
		            format.setTimeZone(utc);   
		            System.out.println(format.format(now));   
		        }

		        System.out.println("09:43AM");

		        //extra addition

		System.out.println("hello GIT");
		System.out.println("merging testing");
		System.out.println("testing rebase");
		System.out.println("this is from merge Br 13.25Pm");
		System.out.println("pull conflicts");
		System.out.println("Merge");	

	}
	

}
