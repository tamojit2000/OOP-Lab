class Order{
  String Name, Number;
  int Quantity, Price, Total;

  void ComputePrice(){
    this.Total=this.Quantity*this.Price;
  }

  Order(String Name,String Number,int Quantity,int Price){
    this.Name=Name;
    this.Number=Number;
    this.Quantity=Quantity;
    this.Price=Price;
  }

  void Display(){
    System.out.println("\n");
    System.out.println(this.Name);
    System.out.println(this.Number);
    System.out.println(this.Quantity);
    System.out.println(this.Price);
    System.out.println(this.Total);
    System.out.println("\n");
  }

}

class ShipedOrder extends Order{
  ShipedOrder(String Name,String Number,int Quantity,int Price){
    super(Name,Number,Quantity,Price);
  }
  void ComputePrice(){
    super.ComputePrice();
    super.Total+=4;
  }
}

class UseOrder{
  public static void main(String[] args) {
    Order a = new Order("A","A",100,10);
    a.ComputePrice();
    a.Display();

    ShipedOrder b = new ShipedOrder("B","B",100,10);
    b.ComputePrice();
    b.Display();
  }
}
