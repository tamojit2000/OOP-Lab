class Circle extends Shape{
  double radius;
  Circle(){
    System.out.println("Constructor Circle");
    this.radius=0;
  }
  Circle(double x){
    System.out.println("Constructor Circle");
    this.radius=x;
  }
  double Area(){
    return 3.14*this.radius*this.radius;
  }
  void Description(){
    System.out.println("Circle R A "+this.radius+" "+this.Area());
  }
}
