package com.eee.client;

import java.util.Scanner;

import com.eee.service.PayMoney;

public class PayMoneyClient {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
        
    	System.out.println(" Enter the size of transaction array");
    	int size = scanner.nextInt();
    	 int[] transactions =  new int [size];
    	 System.out.println("Enter the values of array");
    	for(int i=0; i< size; i++) {
    		int note  = scanner.nextInt();
    		transactions[i] = note;
    	}
        
    	 System.out.println("Enter the total no of targets that needs to be achieved");
    	 int noOfTarget = scanner.nextInt();
        
    	 for(int i=0; i< noOfTarget; i++) {
     		
     		 System.out.println("Enter the value of target");
        	 int target = scanner.nextInt();

            PayMoney PayMoney = new PayMoney(transactions);

            int index = PayMoney.testTargetAchieved(target);
            if (index != -1 ) {
                System.out.println("Target is achieved after " +index+" iterations");
            } else {
                System.out.println("Target not achieved after "+ transactions.length + " iterations");
            }
     	}
    	
        
        scanner.close();
    }

}
