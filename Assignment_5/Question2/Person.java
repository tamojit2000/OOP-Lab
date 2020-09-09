class Person{
  String HOBBY,name;
  Person(String name){
    this.HOBBY="Reading";
    this.name=name;
  }
  String getName(){
    return this.name;
  }
  String getHobby(){
    return this.HOBBY;
  }
  void introduce(){
    System.out.println("Hello, my name is "+this.getName()+" and my hobby is "+this.getHobby());
  }
}
