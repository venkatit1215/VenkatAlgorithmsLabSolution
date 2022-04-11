package com.eee.client;

import java.util.Scanner;

public class NoteCounterClient {

    public static void main(String[] args) {
    	
    	Scanner scanner =  new Scanner(System.in);
    	System.out.println("Enter the size of currency denominations");
    	int size = scanner.nextInt();
    	int[] notes = new int [size];
    	System.out.println("Enter the currency denominations value");
    	for(int i=0; i< size; i++) {
    		int note  = scanner.nextInt();
    		notes[i] = note;
    		
    	}
        int[] noteCounter = new int[size];
        System.out.println("Enter the amount you want to pay");
        int amount = scanner.nextInt();
        for(int index = 0; index < notes.length; index++){
            if(amount >= notes[index]){
                noteCounter[index] = amount / notes[index];
                amount = amount - noteCounter[index] * notes[index];
            }
        }
        if(amount > 0){
            System.out.println("Cannot tender exact change: Balance is "+ amount);
        } else {
            for (int loop  = 0; loop < notes.length; loop++){
                if (noteCounter[loop] != 0){
                    System.out.println("Notes: " + notes[loop] + " number: "+noteCounter[loop]);
                }
            }
        }
        scanner.close();
    }
   
}
