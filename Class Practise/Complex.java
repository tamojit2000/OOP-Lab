class Complex
{
  int real=0;
  int img=0;

  void getdata(int x, int y){
    real=x;
    img=y;

  }

  Complex multiply(Complex C1, Complex C2){
    int x=C1.real*C2.real - C1.img*C2.img;
    int y=C1.real*C2.img + C1.img*C2.real;
    Complex com=new Complex();
    com.getdata(x,y);
    return com;
  }

  void disp(){
    System.out.println("( "+real+" "+img+" )");
  }

}
