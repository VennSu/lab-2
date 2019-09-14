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
public class bai3 {
    public static void main(String[] args) {
        int sodien,tien;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhập số điện:");
        sodien = scanner.nextInt();
        if(sodien<50){
                tien = sodien*1000;
                System.out.print("Tiền:"+tien);
        }
        else{
            tien = 50*1000 + (sodien-50)*1200;
            System.out.print("Tiền:"+tien);
        }
    }
}
