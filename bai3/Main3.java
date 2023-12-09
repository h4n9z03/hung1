/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DuongThang dt = new DuongThang(5);
        dt.setSoCanh(0);
        dt.setMau("Đen");
        dt.Inkq();
        System.out.println("Duong thang duoc ve la");
        dt.ve();
        
    }
    
}
