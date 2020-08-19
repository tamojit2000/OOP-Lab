import java.util.Scanner;

class P2{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter: ");
    char x=sc.next().charAt(0);
    switch(x){
      case 'a':
      case 'A':
        System.out.println("Action movie fan");
        break;
      case 'c':
      case 'C':
          System.out.println("Comedy movie fan");
          break;
      case 'd':
      case 'D':
          System.out.println("Drama movie fan");
          break;
      default:
        System.out.println("Invalid choice");
    }
  }

}
