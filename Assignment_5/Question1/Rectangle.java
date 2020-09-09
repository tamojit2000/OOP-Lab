class Rectangle extends Shape{
  double length,breadth;
  Rectangle(){
    System.out.println("Constructor Rectangle");
    this.length=0;
    this.breadth=0;
  }
  Rectangle(double x,double y){
    System.out.println("Constructor Rectangle");
    this.length=x;
    this.breadth=y;
  }
  double Area(){
    return this.length*this.breadth;
  }
  void Description(){
    System.out.println("Rectangle L B A "+this.length+" "+this.breadth+" "+this.Area());
  }

}
