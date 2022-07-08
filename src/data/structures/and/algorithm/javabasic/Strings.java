/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithm.javabasic;

/**
 *
 * @author ACER
 */
public class Strings {

    public static void main(String[] args) {
        //0 is the first position in a string, 1 is the second, 2 is the third ...
        String greeting = "Hello";
        System.out.println("do dai chuoi: " + greeting.length()); //in do dai chuoi
        System.out.println("In hoa: " + greeting.toUpperCase()); //in HOA
        System.out.println("In hoa: " + greeting.toLowerCase()); //in Thường

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7 (bao gồm khoảng trắng)

        //ghep chuoi
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); //John Doe
        System.out.println(firstName.concat(lastName)); //John Doe

        String x = "10";
        String y = "20";
        int c = 20;
        String z1 = x + y;  // z will be 1020 (a String)
        String z2 = x + c;  // z will be 1020 (a String)

        //Kí tự đặc biệt
        /*
        Escape character	Result	Description
        \'                      '	Single quote
        \"                      "	Double quote
        \\                      \	Backslash
         */
        //String txt = "We are the so-called "Vikings" from the north.";(lỗi)
        String txt2 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt2);//Output: We are the so-called "Vikings" from the north.
        String txt3 = "It\'s alright.";
        System.out.println(txt3);// OUt put: It's alright.
        String txt4 = "The character \\ is called backslash.";
        System.out.println(txt4);//Out put: The character \ is called backslash.
        /*
        \n	New Line	
        \r	Carriage Return	
        \t	Tab	
        \b	Backspace	
        \f	Form Feed	
         */
    }
}
