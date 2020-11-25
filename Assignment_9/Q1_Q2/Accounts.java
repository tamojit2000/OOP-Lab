package Banking;

public abstract class Accounts{
  public int cust_id;
  public String cust_name;
  public double balance;
  public Accounts(){
    this.cust_id=0;
    this.cust_name="";
    this.balance=0.0;
  }
  public Accounts(int a,String b,double c){
    this.cust_id=a;
    this.cust_name=b;
    this.balance=c;
  }
  public abstract void Display();
}
