/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class bai1 {
    public static void main(String[] args) {
        int a,b;
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a:");
        a = scanner.nextInt();
        System.out.print("nhập b:");
        b = scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.print("Phương trình vô số nghiệm");
            }
            else{
                System.out.print("Phương trình vô nghiệm");
            }
        }       else{
                x = (float)-b/a;
                System.out.print("Phương trình có nghiệm là:"+x);}
    }
}
