/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathuntil;

/**
 *
 * @author Zenos
 */
//Ta viết cái class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì
//Cho riêng ta, hàm STATIC giúp làm điều này
public class MathUntil {

    //n!        1.2.3.4.5.6....n
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
        }
        //Hàm dừng liền éo cần return

        if (n == 0 || n == 1) {
            return 1;
        }

        // Xuống đây n - 2...20
        //Chơi for hoặc đệ quy - recursion
        //Kĩ thuật nhồi con heo đất, ốc bu nhồi thịt
        //i = 2 , i = 3, ...
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
            //product = product * i;

        return product;
        
    }
}
