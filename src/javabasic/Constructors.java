/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author ACER
 */
public class Constructors {

    int x;  // Create a class attribute

    public Constructors() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x=5
    }

}
