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
public class bai4 {
    public static void main(String[] args) {
        int chucnang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("+---------------+");
        System.out.println("1:Giải phương trình bậc nhất");
        System.out.println("2:Giải phương trình bậc 2");
        System.out.println("3:Tính tiền điện");
        System.out.println("4:Kết thúc");
        System.out.println("+---------------+");
        System.out.printf("Chọn chức năng:");
        chucnang = scanner.nextInt();
        switch(chucnang){
            case 1:
                System.out.print("Giải phương trình bậc nhất");
                break;
            case 2:
                System.out.print("Giải phương trình bậc 2");
                break;
            case 3:
                System.out.print("Tính tiền điện");
                break;
            default : 
                System.out.print("Kết thúc");
                    
        }
    }
}
