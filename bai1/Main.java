/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten doi bong: ");
        String tenDoiBong = scanner.nextLine();
        System.out.println("Nhap so luong cau thu");
        int soCauThu = scanner.nextInt();
        DoiBong doiBong = new DoiBong(tenDoiBong, soCauThu);
        doiBong.inDanhSachCauThu();
        doiBong.sapXepVaInGiaCaoDenThap();
        // TODO code application logic here
    }
    
}
