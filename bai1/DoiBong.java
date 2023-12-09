/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class DoiBong {
    private String tenDoiBong;
    private int soCauThu;
    private CauThu[] danhSachCauThu;

    public DoiBong(String tenDoiBong, int soCauThu) {
        this.tenDoiBong = tenDoiBong;
        this.soCauThu = soCauThu;
        this.danhSachCauThu = new CauThu[soCauThu];
        
        for (int i = 0; i< soCauThu; i++) {
            danhSachCauThu[i] = CauThu.scanInfo();
        }
    }
    public void inDanhSachCauThu() {
        System.out.println("Danh sach cau thu cua doi bong" + tenDoiBong);
        for(CauThu cauThu : danhSachCauThu) {
            cauThu.printInfo();
        }
    }
    public void sapXepVaInGiaCaoDenThap() {
        Arrays.sort(danhSachCauThu, 
                Comparator.comparingDouble(CauThu::getGia).reversed());
    }
    
    
   
}
