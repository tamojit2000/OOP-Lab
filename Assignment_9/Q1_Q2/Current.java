package Banking.Current;

import Banking.*;

public class Current extends Accounts{
  public Current(int id,String name,double balance){
    super(id,name,balance);
  }
  public void Display(){
    String s="ID: "+this.cust_id+"\tName: "+this.cust_name+"\tBalance: "+this.balance;
    System.out.println(s);
  }
  public void Withdraw(double amt){
    if(amt<=this.balance){
      this.balance-=amt;
      System.out.println("Succesful withdraw "+amt);
    }else{
      System.out.println("\nNot enough balance\n");
    }
  }
  public void Deposit(double amt){
    if(amt>10000){
      this.balance+=amt;
      System.out.println("Succesful deposited ${amt}");
    }else{
      System.out.println("Not enough amount");
    }

  }
}
