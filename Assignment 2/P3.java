import java.util.Scanner;

class P3{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Salary Merit");
    int salary=sc.nextInt();
    int merit=sc.nextInt();
    

    if (salary>500 && salary<600){
      System.out.println("Grade C");
    }
    else if (salary>600 && salary<649 && merit<10){
      System.out.println("Grade C");
    }
    else if (salary>600 && salary<649 && merit>10){
      System.out.println("Grade B");
    }
    else if (salary>649 && salary<700){
      System.out.println("Grade B");
    }
    else if (salary>700 && salary<799 && merit<20){
      System.out.println("Grade B");
    }
    else if (salary>700 && salary<799 && merit>20){
      System.out.println("Grade A");
    }
    else if (salary>799){
      System.out.println("Grade A");
    }



  }




}
