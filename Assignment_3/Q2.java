import java.util.Scanner;

class Q2{
  public static void main(String[] args) {
    CUSTOMDATA data=new CUSTOMDATA();
    Scanner sc=new Scanner(System.in);
    int opt,value;
    while(true){
      Menu();
      opt=sc.nextInt();
      if(opt==1){
        data.initialize();
      }
      else if(opt==2){
        System.out.println("Enter value");
        value=sc.nextInt();
        data.insert(value);
      }
      else if(opt==3){
        data.remove();
      }
      else if(opt==4){
        data.display();
      }
      else if(opt==5){
        break;
      }
      else{
        System.out.println("Wrong opt");
      }
    }


  }
  static void Menu(){
    System.out.println(""
    +"MENU:\n\n"
    +"1.Initialize\n"
    +"2.INSERTED\n"
    +"3.Remove\n"
    +"4.Display\n"
    +"5.Quit\n\n");
  }
}
