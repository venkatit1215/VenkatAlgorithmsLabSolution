package com.eee.service;

public class PayMoney {
	 private final int[] transactions;

	    public PayMoney(int[] transaction){
	        this.transactions = transaction;
	    }

	    public int testTargetAchieved(int target) {

	        int sum = 0;
	        for(int index = 0; index < transactions.length; index++ ){
	            sum = sum + transactions[index];
	            if(sum >= target){
	                return index + 1;
	            }

	        }
	        return -1;
	    }

}
