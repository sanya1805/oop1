package oop;

import java.util.Scanner;
public abstract class water753  implements intoWater {
 
    
    private int wtEnd;
    private int wtStart;
    int sumwater = 0;
    double price = 0.00;
    public double sumwaterbill;
    
    public void intowater1() {
        
        System.out.println("==================ชำระบิลค่าน้ำ==================");
       
    }
    
    public void pagewateruser() {
   
   
        System.out.println(">>>กรุณากรอกรายละเอียด ");
        
        do{
        System.out.println("มิเตอร์ล่าสุดต้องมากกว่ามิเตอร์เริ่มต้นเท่านั้น!");
        System.out.print("มิเตอร์เริ่มต้น : ");
        Scanner waterStart = new Scanner(System.in);
        wtStart = waterStart.nextInt();
        
        System.out.print("มิเตอร์ล่าสุด : ");
        Scanner waterEnd = new Scanner(System.in);
        wtEnd = waterEnd.nextInt();
        System.out.println("----------------------------------------------");
        }while(this.wtEnd<this.wtStart);
        
       this.SumMeterWater();
       System.out.println("มิเตอร์ทั้งหมด คือ " +sumwater+ " Unit"); 
             
    }  
   
        public int SumMeterWater(){
                sumwater = wtEnd - wtStart;
                return sumwater;
        }
        
        public void price(){
            
            this.SumMeterWater();
            if(sumwater <=10){
                price = sumwater*10.20;
            }
            else if(sumwater <=20){
                price = sumwater*16;
            }
            else if(sumwater <=30){
                price = sumwater*19;
            }
            else{
                price = sumwater*21.20;
            }
            
            System.out.println("ยอดการใช้น้ำทั้งหมด = " +price+ " THB");
        }
       public void memberwater() {
            
            sumwaterbill = price;
            System.out.println("ค่าบริการทั้งหมด " +sumwaterbill);
   
    }
       public void Notmemberwater() {
   
            sumwaterbill = price + 15;
            System.out.println("ค่าบริการทั้งหมด " +sumwaterbill);
    
    }    
}



    
    


