/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opp.encapsulation;

/**
 *
 * @author ACER
 */
public class Test {

    public static void main(String[] args) {
        Person myObj = new Person();

        //myObj.name = "John";  // error
        //System.out.println(myObj.name); // error

        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}
