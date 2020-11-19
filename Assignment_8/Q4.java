class Officer{
  String Name;
  double Limit;
  Officer(String name,double limit){
    this.Name=name;
    this.Limit=limit;
  }
  void MoneyApproveText(float money){
    System.out.println("Approved: "+money);
  }
  void DontApproveText(){
    System.out.println("Not Approved: ");
  }
  void Approve(float money){
    if(money<=this.Limit){
      MoneyApproveText(money);
    }else{
      DontApproveText();
    }
  }
  void Display(){
    System.out.println("Name: "+this.Name+"\tLimit: "+this.Limit);
  }
}
class JuniorOfficer extends Officer{
  JuniorOfficer(String name){
    super(name,10000);
  }
}
class SeniorOfficer extends Officer{
  SeniorOfficer(String name){
    super(name,50000);
  }
}
class ExecutiveOfficer extends Officer{
  ExecutiveOfficer(String name){
    super(name,100000);
  }
}
class Q4{
  public static void main(String[] args) {
    JuniorOfficer J=new JuniorOfficer("J");
    SeniorOfficer S=new SeniorOfficer("S");
    ExecutiveOfficer E=new ExecutiveOfficer("E");

    J.Display();
    S.Display();
    E.Display();

    J.Approve(5000);
    J.Approve(55000);

    S.Approve(5000);
    J.Approve(55000);

    E.Approve(55000);
    E.Approve(5000000);
  }
}
