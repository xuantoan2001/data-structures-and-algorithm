/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithm.javabasic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ACER
 */
public class List {
   public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    cars.get(0);//Output: Volvo
    cars.set(0, "Opel");//Output: Volvo = Opel
    cars.remove(0);//cars = [ BMW, Ford, Mazda]
    cars.size();//Output: 3
    
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
    for (String i : cars) {
      System.out.println(i);
    }
    
    Collections.sort(cars);  // Sort cars : output: BMW,Ford,Mazda,Volvo (a-z)
  }
    
}
