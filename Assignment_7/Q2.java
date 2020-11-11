import java.util.ArrayList;

class Employee{
  int ID;
  String Name;
  double Salary;
  Employee(int id,String name,double salary){
    this.ID=id;
    this.Name=name;
    this.Salary=salary;
  }
  void Display(){
    String s="\nID: "+this.ID+"\nName: "+this.Name+"\nSalary: "+this.Salary+"\n";
    System.out.println(s);
  }
}

class EmployeeManager{

  static ArrayList<Employee> DB=new ArrayList<Employee>();

  public static void main(String[] args) {

    AddEmp(new Employee(1,"A",45.5));
    AddEmp(new Employee(2,"B",75.5));
    AddEmp(new Employee(3,"C",45.8));
    AddEmp(new Employee(4,"D",74.5));
    AddEmp(new Employee(5,"E",21.5));

    Display_DB();

    RmEmp(3);

    Display_DB();

    System.out.println(Check(3));
    System.out.println(Check(5));

  }

  static void AddEmp(Employee e){
    DB.add(e);
  }

  static void RmEmp(int id){
    int index=0;
    for(int i=0;i<DB.size();i++){
      if (DB.get(i).ID==id){
        index=i;
      }
    }
    DB.remove(index);
  }

  static boolean Check(int id){
    for(Employee e:DB){
      if(e.ID==id){
        return true;
      }
    }
    return false;
  }

  static void Display_DB(){
    for(Employee e:DB){
      e.Display();
    }
  }

}
