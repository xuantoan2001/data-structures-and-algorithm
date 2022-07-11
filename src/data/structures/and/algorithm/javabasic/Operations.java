/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structures.and.algorithm.javabasic;

/**
 *
 * @author ACER
 */
public class Operations {

    int sum1 = 100 + 50;        // 150 (100 + 50)
    int sum2 = sum1 + 250;      // 400 (150 + 250)
    int sum3 = sum2 + sum2;     // 800 (400 + 400)

    public static void main(String[] args) {
        int x = 5;
        x += 3;//x = x + 3
        x &= 3;// x = x & 3 , Output: 1
        /*
        =	x = 5	x = 5	
        +=	x += 3	x = x + 3	
        -=	x -= 3	x = x - 3	
        *=	x *= 3	x = x * 3	
        /=	x /= 3	x = x / 3	
        %=	x %= 3	x = x % 3	
        &=	x &= 3	x = x & 3   out: 1	
        |=	x |= 3	x = x | 3   out:7	
        ^=	x ^= 3	x = x ^ 3   out:6
        >>=	x >>= 3	x = x >> 3  out:0
        <<=	x <<= 3	x = x << 3  out:40
         */

 /*
        && : cả 2 điều đúng => đúng
        || : 1 trong 2 cái đúng => sai
        ! : đảo ngược kết quả !(5>3)= false
         */
        //bieu thuc dieu kien: variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";//out: Good evening.
        
    }
}
