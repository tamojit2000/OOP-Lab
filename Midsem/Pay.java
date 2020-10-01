class Pay{

  double hoursWorked,rateOfPayPerHour,withholdingRate,grossPay,netPay;

  void computeNetPay(double hours,double rate,double withhold){
    this.hoursWorked=hours;
    this.rateOfPayPerHour=rate;
    this.withholdingRate=withhold;

    this.grossPay=this.hoursWorked * this.rateOfPayPerHour;
    this.netPay=this.grossPay - (this.withholdingRate);
  }

  void computeNetPay(double hours,double rate){
    this.hoursWorked=hours;
    this.rateOfPayPerHour=rate;
    this.withholdingRate=0.15;

    this.grossPay=this.hoursWorked * this.rateOfPayPerHour;
    this.netPay=this.grossPay * (1 - this.withholdingRate);
  }

  void computeNetPay(double hours){
    this.hoursWorked=hours;
    this.rateOfPayPerHour=5.85;
    this.withholdingRate=0.15;

    this.grossPay=this.hoursWorked * this.rateOfPayPerHour;
    this.netPay=this.grossPay * (1 - this.withholdingRate);
  }

  public static void main(String[] args) {
    Pay p1=new Pay();
    Pay p2=new Pay();
    Pay p3=new Pay();

    p1.computeNetPay(30);
    p2.computeNetPay(30,6);
    p3.computeNetPay(30,6,100);

    System.out.println("Gross: "+p1.grossPay + "-" + "Net: " + p1.netPay);
    System.out.println("Gross: "+p2.grossPay + "-" + "Net: " + p2.netPay);
    System.out.println("Gross: "+p3.grossPay + "-" + "Net: " + p3.netPay);
  }

}
