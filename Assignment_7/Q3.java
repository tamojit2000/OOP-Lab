import java.util.Scanner;

class Q3{
  public static void main(String[] args) {
    int num=0;
    Scanner Sc=new Scanner(System.in);
    System.out.println("ENter Num:");
    num=Sc.nextInt();
    if (num>0){
      System.out.println(Reverse(num));
    }else{
      System.out.println("Invalid Input");
    }
  }
  static int Reverse(int x){
    int r=0;
    while(x>0){
      r=r*10+x%10;
      x=x/10;
    }
    return r;
  }
}
