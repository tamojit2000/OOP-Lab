class Triangle{

  int base=0;
  int height=0;
  float area=0;

  Triangle(){
    this.base=base;
    this.height=height;
    this.area=getArea();
  }

  Triangle(int base,int height){
    if (InCorrectDimens(base,height)){
      System.out.println("Error - base/height cannot be 0 or negative");
      return;
    }
    this.base=base;
    this.height=height;
    this.area=getArea();
  }

  boolean InCorrectDimens(int base,int height){
    return (base<=0 || height<=0);
  }



  void Show(){
    System.out.println("B: "+base+" H: "+height+" Ar: "+area);
  }

  float getArea(){
    return base*height/2;
  }

  int compare(Triangle T){
    return (Float.compare(area,T.area));
  }
}
