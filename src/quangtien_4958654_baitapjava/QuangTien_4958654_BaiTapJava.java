/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quangtien_4958654_baitapjava;

import caculates.CasioCalculator;
import interfaces.ICalculate;




/**
 *
 * @author asus
 */
public class QuangTien_4958654_BaiTapJava
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ICalculate calculator = new CasioCalculator();
        System.out.println("7+ 8 = " + calculator.cong(7, 8));
        System.out.println("9 x 3 = " + calculator.nhan(9, 3));
    }
    
}
