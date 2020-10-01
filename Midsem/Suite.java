class Suite extends HotelRoom{
  Suite(int num){
    super(num);
    super.nightlyRentalRate+=40;
    if (num>299){
      super.nightlyRentalRate*=1.15;
    }
  }

}
