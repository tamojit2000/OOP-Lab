class CheckingAccount{
  String AccountNumber;
  int Balance;

  CheckingAccount(String a,int b){
    this.AccountNumber=a;
    if(b<200){
      this.Balance=0;
    }else{
      this.Balance=b;
    }
  }
  void Display(){
    System.out.println("\n");
    System.out.println(this.AccountNumber);
    System.out.println(this.Balance);
  }
}

class TestAccount{
  public static void main(String[] args) {
    CheckingAccount A1=new CheckingAccount("A1",564);
    CheckingAccount A2=new CheckingAccount("A2",64);

    A1.Display();
    A2.Display();

  }
}
