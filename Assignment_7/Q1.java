class Bicycle{
  int gear=0,speed=0;
  Bicycle(int x,int y){
    this.gear=x;
    this.speed=y;
  }
  void putBrakes(int x){
    this.speed-=x;
  }
  public String toString(){
    return "Gear: "+this.gear+"\nSpeed: "+this.speed+"\n";
  }
}

class MountainBike extends Bicycle{
  int seatHeight=0;
  MountainBike(int x,int y,int z){
    super(x,y);
    this.seatHeight=z;
  }
  public String toString(){
    return super.toString()+"Height: "+this.seatHeight+"\n";
  }
}

class Driver{
  public static void main(String[] args) {
    MountainBike M=new MountainBike(10,20,30);
    System.out.println(M.toString());
    M.putBrakes(5);
    System.out.println(M.toString());
  }
}
