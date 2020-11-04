class Pay{
  double net_pay;

  void computeNetPay(double h_worked,double rate,double with){
    this.net_pay=h_worked*rate-with;
  }

  void computeNetPay(double h_worked,double rate){
    this.net_pay=h_worked*rate*0.85;
  }

  void computeNetPay(double h_worked){
    this.net_pay=h_worked*5.85*0.85;
  }

  void Display(){
    System.out.println(this.net_pay);
  }

  public static void main(String[] args) {
    Pay P1=new Pay();
    P1.computeNetPay(12.5,12.5,12.5);
    P1.Display();

    Pay P2=new Pay();
    P2.computeNetPay(12.5,12.5);
    P2.Display();

    Pay P3=new Pay();
    P3.computeNetPay(12.5);
    P3.Display();

  }

}
