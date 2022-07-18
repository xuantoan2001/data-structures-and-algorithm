/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author ACER
 */
public class TypeCasting {
    
    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String
    final int myNum2 = 15;//final ko the thay doi chi doc
    
    /*
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double
    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
     */
    public static void main(String[] args) {
        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
    }
}
