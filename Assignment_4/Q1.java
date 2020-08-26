import java.util.Scanner;

class Q1{
  public static void main(String[] args) {
    Triangle T1=new Triangle(),T2=new Triangle();
    Scanner sc=new Scanner(System.in);
    int opt,base,height,compareValue;
    while(true){
      Menu();
      opt=sc.nextInt();
      if (opt==1){
        System.out.println("Base 1");
        base=sc.nextInt();
        System.out.println("Height 1");
        height=sc.nextInt();
        T1=new Triangle(base,height);
      }
      else if (opt==2){
        System.out.println("Base 2");
        base=sc.nextInt();
        System.out.println("Height 2");
        height=sc.nextInt();
        T2=new Triangle(base,height);
      }
      else if (opt==3){
        System.out.println("Area 1: "+T1.area);
      }
      else if (opt==4){
        System.out.println("Area 2: "+T2.area);
      }
      else if (opt==5){
        compareValue=T1.compare(T2);
        if (compareValue==1){
          System.out.println("T1 is larger");
        }
        else if (compareValue==-1){
          System.out.println("T2 is larger");
        }
        else if (compareValue==0){
          System.out.println("Equal area");
        }
      }
      else if (opt==6){
        System.out.println("T1: ");
        T1.Show();
      }
      else if (opt==7){
        System.out.println("T2: ");
        T2.Show();
      }
      else if (opt==8){
        System.out.println("Exit");
        break;
      }
    }
  }

  static void Menu(){
    System.out.println(""
    +"MENU:\n\n"
    +"1.Initialize T1\n"
    +"2.Initialize T2\n"
    +"3.Area A1\n"
    +"4.Area A2\n"
    +"5.Compare\n"
    +"6.Display 1\n"
    +"7.Display 2\n"
    +"8.Exit\n\n");
  }

}
