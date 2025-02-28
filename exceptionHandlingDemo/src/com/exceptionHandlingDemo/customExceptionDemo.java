package com.exceptionHandlingDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class greaterMarksException extends RuntimeException {
	
}
public class customExceptionDemo {


	
	public static void main(String[] args) {
		student s1=new student(1001,"sai",102);
		try {
		if(s1.getMarks()>100) {
			throw new greaterMarksException();
		}}
		catch(Exception e) {
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        String dateTime = sdf.format(new Date());

		        // Prepare the log message
		    
		        String logMessage = "Exception occurred at " + dateTime + " - " + e.toString();
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter("exception_log.txt", true))) {
		            writer.write(logMessage);
		            writer.newLine();
		        } catch (IOException ioException) {
		            System.out.println("Error writing to log file: " + ioException.getMessage());
		        }
			System.out.println(e);
		}
	}

}
