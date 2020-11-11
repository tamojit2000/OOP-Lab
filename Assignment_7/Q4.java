class Student{
  int Roll;
  String Name,Collg;
}

class Q4{
  static int Counter=1;
  static String College="ABC";
  static void setRollNo(Student S){
    S.Roll=Counter;
    Counter++;
  }
  static void setCollg(Student S){
    S.Collg=College;
  }
  static void setName(Student S,String name){
    S.Name=name;
  }
  static void studentInfo(Student S){
    String s="\nRoll: "+S.Roll+"\nName: "+S.Name+"\nCollg: "+S.Collg+"\n";
    System.out.println(s);
  }
  public static void main(String[] args) {
    Student S1=new Student();
    Student S2=new Student();
    setRollNo(S1);setName(S1,"A");setCollg(S1);
    setRollNo(S2);setName(S2,"B");setCollg(S2);
    studentInfo(S1);
    studentInfo(S2);
  }


}
