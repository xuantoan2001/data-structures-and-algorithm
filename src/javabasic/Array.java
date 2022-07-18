/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

/**
 *
 * @author ACER
 */
public class Array {

    public static void Arrays(String[] args) {
        //mang rong
        String[] cars;
        int[] myNum;

        //mang so nguyen
        int[] myNum2 = {10, 20, 30, 40};

        //mang chuoi
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]); // Outputs: Volvo
        cars2[0] = "Opel"; // cars2 = {"Opel", "BMW", "Ford", "Mazda"};

        //so phan tu mang
        System.out.println(cars2.length);//Outputs:4

        //duyet mang
        for (int i = 0; i < cars2.length; i++) {
            System.out.println(cars2[i]);
        }//cach1
        for (String i : cars2) {
            System.out.println(i);
        }//cach2
    }

    public static void MultidimensionalArrays(String[] args) {
        //int[][] myNumbers;
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        //duyet mang
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
    

}
