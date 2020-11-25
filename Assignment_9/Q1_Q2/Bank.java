package Banking;

import Banking.Savings.Savings;
import Banking.Current.Current;

class Bank{
    public static void main(String[] args) {
      Savings S=new Savings(1,"S",20000);
      Current C=new Current(2,"C",20000);

      S.Display();
      S.Deposit(5000);
      S.Display();
      S.Withdraw(2500);
      S.Display();

      C.Display();
      C.Deposit(5000);
      C.Display();
      C.Withdraw(2500);
      C.Display();


    }
}
