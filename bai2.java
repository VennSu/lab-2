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
public class bai2 {
    public static void main(String[] args) {
        int a,b,c,delta,x,x1,x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a:");
        a = scanner.nextInt();
        System.out.print("nhập b:");
        b = scanner.nextInt();
        System.out.print("nhập c:");
        c = scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.print("Phương trình vô số nghiệm");
            }
            else{
                System.out.print("Phương trình vô nghiệm");
            }
        }
        else{
                delta = (int) (Math.pow(b,2)- 4*a*c);
                if(delta<0){
                    System.out.print("Phương trình vô nghiệm");
                }
                else if (delta==0){
                    x = -b / (2*a);
                }
                else{
                    x1 = (int)(-b+Math.sqrt(delta))/(2*a);
                    x2 = (int)(-b-Math.sqrt(delta))/(2*a);
                    System.out.print("Phương trình có nghiệm là x1:"+x1);
                    System.out.print("Phương trình có nghiệm là x2:"+x2);
                }
        }
    }
}
