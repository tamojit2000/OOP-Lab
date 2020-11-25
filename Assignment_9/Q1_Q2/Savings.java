package Banking.Savings;

import Banking.*;

public class Savings extends Accounts{
  double dwl;
  public Savings(int id,String name,double balance){
    super(id,name,balance);
    this.dwl=super.balance*0.5;
  }
  public Savings(int id,String name){
    super(id,name,1000.0);
    this.dwl=super.balance*0.5;
  }
  public void Display(){
    String s="ID: "+this.cust_id+"\tName: "+this.cust_name+"\tBalance: "+this.balance;
    s=s+"\tLimit: "+this.dwl;
    System.out.println(s);
  }
  public void Withdraw(double amt){
    if(amt<=this.dwl && amt<=this.balance){
      this.balance-=amt;
      System.out.println("Succesful withdraw "+amt);
    }else{
      System.out.println("\nLimit Exceeded\n");
    }
  }
  public void Deposit(double amt){
    this.balance+=amt;
    System.out.println("Succesful deposited ${amt}");
  }
}
