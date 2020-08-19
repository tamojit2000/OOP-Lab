class Q2{
  public static void main(String[] args) {
    CUSTOMDATA data=new CUSTOMDATA();
    data.initialize();
    data.display();
    data.insert(5);
    data.insert(7);
    data.insert(8);
    data.display();

    data.initialize();
    data.display();
    data.insert(1);
    data.insert(2);
    data.insert(3);
    data.display();

  }
}
