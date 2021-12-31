package com.greatlearning;

public class Service {
	
	public void targetAchievement(int arr[], int size, int target){
		
		int sum = 0;
		boolean achieved = false;
		for(int i = 1; i<=size; i++) {
			sum+=arr[i];
			if(sum>=target) {
				System.out.println("Target achieved after " +i+ " transactions");
				achieved = true;
				break;
			}
		}
		if(!achieved)
			System.out.println("Given target is not achieved");
	}
}
