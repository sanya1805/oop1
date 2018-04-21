
package oop;

import java.util.Scanner;
public abstract class water753  implements intoWater {
 
    
    private int wtEnd;
    private int wtStart;
    int sumwater = 0;
    double price = 0.00;
    public double sumwaterbill;
    
    
    @Override
    public void intowater1() {
        
        System.out.println("=============Water Bill Payment=============");
       
    }
    
    public void pagewateruser() {
   
   
        System.out.println("Enter Detail!! ");
        
        System.out.print("Enter Start Meter : ");
        Scanner waterStart = new Scanner(System.in);
        wtStart = waterStart.nextInt();
        
        System.out.print("Enter End Meter : ");
        Scanner waterEnd = new Scanner(System.in);
        wtEnd = waterEnd.nextInt();
        System.out.println("-------------------------------");
            
        this.SumMeterWater();
        System.out.println("Total Meter : " +sumwater+ " Unit");
        
        
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
            
            System.out.println("Water Price = " +price+ " THB");
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



    
    


