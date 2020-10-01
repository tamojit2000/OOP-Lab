class UseHotelRoom{
  public static void main(String[] args) {
    HotelRoom H1=new HotelRoom(100);
    HotelRoom H2=new HotelRoom(500);

    Suite S1=new Suite(100);
    Suite S2=new Suite(500);


    System.out.println("Hotel H1: "+H1.getRate());
    System.out.println("Hotel H2: "+H2.getRate());
    System.out.println("Suite S1: "+S1.getRate());
    System.out.println("Suite S2: "+S2.getRate());

  }
}
