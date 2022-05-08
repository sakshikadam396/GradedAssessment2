package com.greatlearning.Q1.services;

                                              
import java.util.Stack;

public class ConstructionServices {
	
	public void printConstructionOrder(int[] floors) {
		
		System.out.println("\nThe order of construction is as follows: ");
		
		Stack<Integer> stack = new Stack<Integer>();

		int maxSizeOfFloor = floors.length;

		for (int i = 0; i < floors.length; i++) {

			System.out.println("Day: " + (i+1));

			stack.add(floors[i]);

			while (!stack.isEmpty() && stack.peek() == maxSizeOfFloor) {
				System.out.print(stack.pop() + " ");
				maxSizeOfFloor--;
			}

			System.out.println();

		}
	}
	
}
