import java.util.Scanner;

class Q2{

  static Equipment objArray[]=new Equipment[1000];
  static int pointer=-1;

  public static void main(String[] args) {

    int opt;
    String id="",desc="";

    Scanner sc=new Scanner(System.in);

    while(true){
      Menu();
      opt=sc.nextInt();
      switch(opt){
        case 1:{
          id=sc.next();
          desc=sc.next();
          if (id!=null && desc!=null){
              Add(id,desc);
          }else{
            System.out.println("ID or Desc cant null");
          }
          break;
        }
        case 2:{
          id=sc.next();
          if (id!=null && desc!=null){
              if(Remove(id)){
                System.out.println("Removed");
              }else{
                System.out.println("Not Found");
              }
          }else{
            System.out.println("ID or Desc cant null");
          }
          break;
        }
        case 3:{
          id=sc.next();
          if (id!=null && desc!=null){
              Presence(id);
          }else{
            System.out.println("ID or Desc cant null");
          }
          break;
        }
        case 4:{
          Display();
          break;
        }
        case 5:{
          System.exit(0);
        }
        default:
          System.out.println("Wrong opt");
      }
    }

  }

  static void Menu(){
    System.out.println(""
    +"MENU:\n\n"
    +"1.ADD\n"
    +"2.REMOVE\n"
    +"3.PRESENCE\n"
    +"4.DISPLAY\n"
    +"5.EXIT\n\n");
  }

  static void Add(String id,String description){
    String tmp_id;
    int tmp_pointer;
    for(int i=0;i<=pointer;i++){
      tmp_id=objArray[i].id;
      if(id.compareTo(tmp_id)<0){
        tmp_pointer=pointer;
        while(tmp_pointer>=i){
          objArray[tmp_pointer+1]=objArray[tmp_pointer];
          tmp_pointer--;
        }
        objArray[i]=new Equipment(id,description);
        pointer++;
        return;
      }
    }
    objArray[++pointer]=new Equipment(id,description);
    return;
  }

  static boolean Remove(String id){
    String tmp_id;
    int tmp_pointer;
    for(int i=0;i<=pointer;i++){
      tmp_id=objArray[i].id;
      if(tmp_id.compareTo(id)==0){
        while(i<=pointer-1){
          objArray[i]=objArray[i+1];
          i++;
        }
        pointer--;
        return true;
      }
    }
    return false;
  }


  static void Display(){
    for(int i=0;i<=pointer;i++){
      System.out.println("Id= "+objArray[i].id+" Desc= "+objArray[i].description);
    }
  }

  static void Presence(String id){
    for(int i=0;i<=pointer;i++){
      if((objArray[i].id).compareTo(id)==0){
        System.out.println("Available in the Lab");
        return;
      }
    }
    System.out.println("Not available in the Lab");
  }

}
