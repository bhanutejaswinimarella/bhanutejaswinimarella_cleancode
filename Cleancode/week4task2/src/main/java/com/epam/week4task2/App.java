package com.epam.week4task2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println("Choose Any one kind of standard material used for construction");
    	System.out.println("standard materials ,above standard materials ,high standard material ,high standard material and fully automated home");
    	
    	Scanner sc=new Scanner(System.in);
    	String materialstandard=sc.nextLine();
    	int materialindex=100;
    	System.out.println("Enter area of the house in squareft");
    	double areaofhouse=sc.nextDouble();
    	String[] standardtype={"standard materials","above standard materials","high standard material","high standard material and fully automated home"};
    	for(int i=0;i<3;i++)
    	{
    		if(materialstandard.equals(standardtype[i]))
    		{
    			materialindex=i;
    			break;
    		}
    	}
    	double[] costpersquarefeet= {1200,1500,1800,2500};
    	try
    	{
    		if(materialindex>=0&&materialindex<4)
    	    	System.out.println("Estimation house construction cost= "+(areaofhouse*costpersquarefeet[materialindex]));
    		else
    		{
    			throw new InputMismatchException("Enter valid material type in input");
    		}
    		
    			
    	}
    	
    	finally
    	{
    		System.out.println("Finally executed");
    	}
    	sc.close();
    }
}
