/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

public abstract class Phone {
   
   public abstract void show();
   public String am;
   public double am1,sum;
   public double ais =100,ch;
   public double dtac = 50;
   public double TRUE = 20;
    
    
   
   //public double vatphone = 15;
   
   
    public void Enternumberphone() {
        
        System.out.print("กรุณาใส่เบอร์ : ");
        Scanner np = new Scanner(System.in);
        String np1 = np.nextLine();

        if (np1.equals("0620640330")) {
            System.out.println("0620640330 TRUE-H ");
            System.out.println("ยอดค้างชำระรวม 990 บาท");
            System.out.println("- เดือนที่ 1 400 บาท");
            System.out.println("- เดือนที่ 2 590 บาท");
            System.out.print("กรุณาใส่จำนวนเงินที่ต้องการชำระ : ");
            Scanner ch1 = new Scanner(System.in);
            ch = ch1.nextDouble();
            

            if (ch == 400) {
                System.out.println("ยอดค้างชำระคงเหลือ 590 บาท");
                sum = ch +15;
               // System.out.println("ค่าบริการทั้งหมด " +sum);
                
            } else if (ch == 590) {
                System.out.println("ยอดค้างชำระคงเหลือ 400 บาท");
                 sum = ch +15;
               // System.out.println("ค่าบริการทั้งหมด " +sum);
                
            } else if (ch == 990) {
                System.out.println("ยอดค้างชำระคงเหลือ 0 บาท");
                 sum = ch +15;
               // System.out.println("ค่าบริการทั้งหมด " +sum);
            }else{
                double some = 990-ch;
                System.out.println("ยอดค้างชำระคงเหลือ "+some+"บาท");
                sum = ch +15;
               // System.out.println(" ค่าบริการทั้งหมด" +sum);
            }
        } else if (np1.equals("0844070204")) {
            System.out.println("0844070204 DTAC ");
            System.out.println("ยอดค้างชำระรวม 1290 บาท");
            System.out.println("- เดือนที่ 1 600 บาท");
            System.out.println("- เดือนที่ 2 690 บาท");
            System.out.print("กรุณาใส่จำนวนเงินที่ต้องการชำระ : ");
            Scanner ch1 = new Scanner(System.in);
             ch = ch1.nextDouble();

            if (ch == 600) {
                System.out.println("ยอดค้างชำระคงเหลือ 690 บาท");
            } else if (ch == 690) {
                System.out.println("ยอดค้างชำระคงเหลือ 600 บาท");
            } else if (ch == 1290) {
                System.out.println("ยอดค้างชำระคงเหลือ 0 บาท");
            }else{
                double some = 1290-ch;
                System.out.println("ยอดค้างชำระคงเหลือ "+some+"บาท");
            }

        }else if (np1.equals("0904810371")) {
            System.out.println("0904810371 AIS ");
            System.out.println("ยอดค้างชำระรวม 690 บาท");
            System.out.println("- เดือนที่ 1 300 บาท");
            System.out.println("- เดือนที่ 2 390 บาท");
            System.out.print("กรุณาใส่จำนวนเงินที่ต้องการชำระ : ");
            Scanner ch1 = new Scanner(System.in);
             ch = ch1.nextDouble();

            if (ch == 300) {
                System.out.println("ยอดค้างชำระคงเหลือ 390 บาท");
            } else if (ch == 390) {
                System.out.println("ยอดค้างชำระคงเหลือ 300 บาท");
            } else if (ch == 690) {
                System.out.println("ยอดค้างชำระคงเหลือ 0 บาท");
            }else{
                double some = 690-ch;
                System.out.println("ยอดค้างชำระคงเหลือ "+some+"บาท");
            }

        }
    }//เม็ด
    public void addmoney() {
        
     
     
     
     
    
        System.out.print("กรุณาใส่เบอร์ : ");
        Scanner a = new Scanner(System.in);
        am = a.nextLine();
        
        do{
        if(am.equals("0899763176")){
            
             System.out.println("0899763176 AIS ");
             System.out.println("ยอดเงินคงเหลือ "+ais+"บาท");
        }else if (am.equals("0948012333")){
            
             System.out.println("0948012333 DTAC ");
             System.out.println("ยอดเงินคงเหลือ "+dtac+"บาท");
        
        }else if (am.equals("0987125853")){
            
             System.out.println("0987125853 TRUE ");
             System.out.println("ยอดเงินคงเหลือ "+TRUE+"บาท");
        
        }}while(am!="0899763176" && am!="0948012333" && am!="0987125853" );
        
        System.out.println("กรุณาเลือกจำนวณเงิน");
        System.out.println("20");
        System.out.println("30");
        System.out.println("50");
        System.out.println("90");
        System.out.println("100");
        System.out.println("150");
        System.out.println("200");
        System.out.print("กรุณาใส่จำนวนเงินที่ต้องการ : ");
        Scanner a1 = new Scanner(System.in);
        am1 = a1.nextDouble();
      
           
    }
    
    public void member() {
        
                sum = ch;
                System.out.println("ค่าบริการทั้งหมด " +sum);
        
        }
    
    public void Notmember() {
       
               
                sum = ch+15;
                System.out.println("ค่าบริการทั้งหมด" +sum);
        
        }
    
    
    
}//คลาส




