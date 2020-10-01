class HotelRoom{
  int roomNumber;
  double nightlyRentalRate;

  HotelRoom(int num){
    this.roomNumber=num;
    if (num<=299){
      this.nightlyRentalRate=69.95;
    }else{
      this.nightlyRentalRate=89.95;
    }
  }

  int getRoom(){
    return this.roomNumber;
  }

  double getRate(){
    return this.nightlyRentalRate;
  }


}
