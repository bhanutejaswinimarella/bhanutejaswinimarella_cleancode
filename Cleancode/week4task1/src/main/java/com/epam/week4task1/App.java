package com.epam.week4task1;
import java.util.Scanner;

import Compoundinterest.CompoundInterest;
import SimpleInterest.Simpleinterest;

public class App 
{
	
    public static void main( String[] args )
    {
        
        System.out.println("Choose Any one\n 1.Simple Interest\n2.Compound Interest");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println("Enter Principalamount,timeperiod,rateofinterest");
        double principalamount=sc.nextDouble();
        double timeperiod=sc.nextDouble();
        double rateofinterest=sc.nextDouble();
        double result;
        if(choice==1)
        {
        	Simpleinterest s=new Simpleinterest(principalamount,timeperiod,rateofinterest);
        	result=s.sinterest();
        	System.out.print("Simple Interest: "+result);
        	
        }
        if(choice==2)
        {
        	System.out.println("How many times the interest is compounded in a year");
        	int n=sc.nextInt();
        	CompoundInterest c=new CompoundInterest(principalamount, timeperiod, rateofinterest, n);
        	result=c.cinterest();
        	System.out.print("Compound Interest: "+result);
        }
        
       sc.close();
    }
}
