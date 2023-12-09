/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh 1");
        int canh1 = scanner.nextInt();
        System.out.println("Nhap canh 2");
        int canh2 = scanner.nextInt();
        System.out.println("Nhap canh 3");
        int canh3 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nhap mau");
        String mau = scanner.nextLine();
        
        TamGiac tamGiac2 = new TamGiac();
        tamGiac2.setCanh1(canh1);
        tamGiac2.setCanh2(canh2);
        tamGiac2.setCanh3(canh3);
        tamGiac2.setMau(mau);
        tamGiac2.Inkq();
    }
    
}
