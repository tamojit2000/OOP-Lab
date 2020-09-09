class Square extends Rectangle{
  Square(){
    System.out.println("Constructor Square");
    this.length=0;
    this.breadth=0;
  }
  Square(double x){
    System.out.println("Constructor Square");
    this.length=x;
    this.breadth=x;
  }
  void Description(){
    System.out.println("Square L B A "+this.length+" "+this.breadth+" "+this.Area());
  }
}
