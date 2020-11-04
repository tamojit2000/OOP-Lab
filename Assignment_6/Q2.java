class HotelRoom{
  int room_number;
  double nightly_rental_rate;

  int getRoomNumber(){
    return this.room_number;
  }

  double getNightlyRental(){
    return this.nightly_rental_rate;
  }

  void Display(){
    System.out.println("Room No "+getRoomNumber()+"\nRate "+getNightlyRental());
  }

  HotelRoom(int num){
    if(num<=299){
      this.nightly_rental_rate=69.95;
    }else{
      this.nightly_rental_rate=89.95;
    }
    this.room_number=num;
  }

}

class Suite extends HotelRoom{
  Suite(int num){
    super(num);
    if(num>299){
      super.nightly_rental_rate=super.nightly_rental_rate*1.15;
    }
    super.nightly_rental_rate=super.nightly_rental_rate+40;
  }
}

class UseHotelRoom{
  public static void main(String[] args) {
    HotelRoom H1=new HotelRoom(45);
    H1.Display();
    System.out.println("\n");
    Suite H2=new Suite(45);
    H2.Display();
  }
}
