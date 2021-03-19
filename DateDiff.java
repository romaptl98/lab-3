/**
*Name-Roma Patel
*Description- :  a method to accept the date and print the duration in days, months and years with 
regards to the current system date
*Date:19/03/2021
*/


import java.time.LocalDateTime;
import java.util.Scanner;

public class DateDiff {
	 public static void main(String[] args) {
	        LocalDateTime current = LocalDateTime.now();

	        System.out.println("Current Date and Time is: " + current);
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Date ");

	        String date = scanner.next();
	    }
	}


