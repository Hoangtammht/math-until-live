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
public class MathUntilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUntil.getFactorial(5);
        System.out.println("Expected: 5! =  120; actual: " + result);
        
        System.out.println("Expected: 6! =  720; actual: " + MathUntil.getFactorial(6));
        
        System.out.println("Expected: 0! =  1; actual: " + MathUntil.getFactorial(0));
        // MathUntil.getFactorial(-5);  Ném ngoại lệ, ai biểu đưa cà chờn làm chi
   
        //Thêm code sau lần đầu tiên làm chuyện ấy - code lên server 7:54 PM 29/12/2021
        System.out.println("Expected: 1! =  1; actual: " + MathUntil.getFactorial(1));
        System.out.println("Expected: 3! =  6; actual: " + MathUntil.getFactorial(3));
        
    }
    
}
