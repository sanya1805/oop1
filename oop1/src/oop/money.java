
package oop;



public class money extends Phone {

    double totala;
    double totald;
    double totalt;
    

    public void show() {
        //System.out.println("=============================");
        super.addmoney();
        
    }

    public void calculate() {

        if (super.am.equals("0899763176")) {

            totala = super.ais + super.am1 ;
            System.out.println("ยอดคงเหลือของหมายเลข " + super.am);
            System.out.println("เท่ากับ " + totala + "บาท");
        } else if (super.am.equals("0948012333")) {
            totald = super.dtac + super.am1;
            System.out.println("ยอดคงเหลือของหมายเลข " + super.am);
            System.out.println("เท่ากับ " + totald + "บาท");
        }
        else if (super.am.equals("0987125853")) {
            totalt = super.TRUE + super.am1;
            System.out.println("ยอดคงเหลือของหมายเลข " + super.am);
            System.out.println("เท่ากับ " + totalt + "บาท");
        }
    }

}
