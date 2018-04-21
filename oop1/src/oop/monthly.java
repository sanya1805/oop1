
package oop;

public abstract class monthly extends Phone implements showphone {
    monthly() {
        
    }
    
    public  void show(){    
     //System.out.println("----------------- โทรศัพท์ -------------------");

    }
    public void sphone(){
    
    super.Enternumberphone();
    super.member();
    this.show();
    
        }  
    
    public  void Notmemb (){  
     super.Enternumberphone();
     super.Notmember();
    
    }
}

