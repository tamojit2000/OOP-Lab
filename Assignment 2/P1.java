import java.util.Scanner;

class P1
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter x y: ");
    int x=sc.nextInt();
    int y=sc.nextInt();
    if (x>0){
      if (y>0){
        System.out.println("quadrant 1");
      } else {
        System.out.println("quadrant 4");
      }
    } else {
      if (y>0){
        System.out.println("quadrant 2");
      } else {
        System.out.println("quadrant 3");
      }

    }

  }
}
