/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithm.javabasic;

import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class JavaHashMap {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");//xoa england
        capitalCities.clear();//xoa tat ca
    }
}
