/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ACER
 */
/**
 * java api java.time Class Description LocalDate Represents a date (year,
 * month, day (yyyy-MM-dd)) LocalTime Represents a time (hour, minute, second
 * and nanoseconds (HH-mm-ss-ns)) LocalDateTime Represents both a date and a
 * time (yyyy-MM-dd-HH-mm-ss-ns) DateTimeFormatter	Formatter for displaying and
 * parsing date-time objects
 */
public class Date {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        convertDate();
    }

    public static void convertDate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
