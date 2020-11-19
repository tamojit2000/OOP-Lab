import java.util.ArrayList;

class Professor{
  String Name;
  String Designation;
  int Experience;
  ArrayList<String> Work;

  Professor(String name,int exp){
    this.Name=name;
    this.Experience=exp;
    this.Designation=Apply_desig(exp);
    this.Work=Apply_work(this.Designation);
  }

  String Apply_desig(int exp){
    if(exp<5){
      return "Assistant Professor";
    }else if(exp>=5 && exp<10){
      return "Associate Professor";
    }else{
      return "HOD";
    }
  }

  ArrayList<String> Apply_work(String desig){
    ArrayList<String> work = new ArrayList<String>();
    work.add("I am teaching.");
    work.add("I do research.");
    if(desig=="Associate Professor"){
      work.add("I am heading a research group.");
    }else if(desig=="HOD"){
      work.add("I am heading a research group.");
      work.add("I am managing the dept.");
    }
    return work;
  }

  void Display(){
    String s="Name: "+this.Name+"\nDesignation: "+this.Designation+"\nExp: "+this.Experience+" years\nWork:\n";
    for(String each:this.Work){
      s=s+each+"\n";
    }
    System.out.println(s);
  }
}

class HRManager{
  public static void main(String[] args) {
    Professor P1=new Professor("A",4);
    Professor P2=new Professor("B",7);
    Professor P3=new Professor("C",12);

    P1.Display();
    P2.Display();
    P3.Display();
  }
}
