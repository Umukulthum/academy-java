package com.bptn.course._05_strings;

public class ReverseNumber {

	public static void main(String[] args) {
		
		        int inputNumber = 1234, reversedValue = 0;
		
		        //inputNumber = 1200; // something else to test, remove later

		        // Add your code here

		      //Condition
		        while(inputNumber > 0){
		            //Increase the place value of reversedValue
		            reversedValue *= 10;

		            //Modulo 10 of a number will always return the last digit
		            //which is then kept in the unit position of reversedValue
		            reversedValue += (inputNumber % 10);

		            //Integer division returns just the number(s) before decimal point cutting out the last digit
		            inputNumber = inputNumber / 10;
		        }
		        
		        System.out.println(reversedValue);
	}

}
