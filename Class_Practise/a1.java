class A1
{
  public static void main(String[] args) {
    Complex C1 = new Complex();
    C1.getdata(3,4);
    Complex C2 = new Complex();
    C2.getdata(6,7);

    C1.disp();
    C2.disp();

    Complex C3 = C1.multiply(C1,C2);
    C3.disp();

  }
}
