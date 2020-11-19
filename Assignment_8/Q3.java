import java.util.*;

class Item{
  String Name;
  float Qty,Price,Total;

  Item(String name,float q,float p){
    this.Name=name;
    this.Qty=q;
    this.Price=p;
    this.Total=q*p;
  }

  void Display(){
    String s="Name: "+this.Name+"\tQuantity: "+this.Qty+"\tPrice: "+this.Price+"\tTotal: "+this.Total;
    System.out.println(s);
  }
}
class SuperMarketManager{
  static ArrayList<Item> ItemList=new ArrayList<Item>();
  static Scanner Sc=new Scanner(System.in);
  static{
    ItemList.clear();
  }
  public static void main(String[] args) {

    AddItem();
    AddItem();

    AddItem();

    Display();

    DelItem();

    Display();

    DelItem();

    Display();

    CheckOut();

  }
  static void AddItem(){
    System.out.println("Item Name:");
    String name=Sc.next();
    System.out.println("Quantity");
    float qty=Sc.nextFloat();
    System.out.println("Price");
    float p=Sc.nextFloat();
    Item item=new Item(name,qty,p);
    ItemList.add(item);
    System.out.println("Item Added");
  }
  static void Display(){
    for(Item item:ItemList){
      item.Display();
    }
  }
  static void DelItem(){
    System.out.println("Enter Index");
    int index=Sc.nextInt();
    try{
      ItemList.remove(index);
    }catch(Exception ex){
      System.out.println("Item Not Found");
    }
  }
  static void CheckOut(){
    float GrandTotal=0.0f;
    for(Item item:ItemList){
      GrandTotal+=item.Total;
    }
    System.out.println("GrandTotal: "+GrandTotal);

  }
}
