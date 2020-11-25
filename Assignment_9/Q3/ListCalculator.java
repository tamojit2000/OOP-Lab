import java.util.ArrayList;

class ListCalculator{
  final static void Display(ArrayList<Integer> A1){
    for(int d:A1){
      System.out.println(d);
    }
  }
  final static ArrayList<Integer> AddList(ArrayList<Integer> A1,ArrayList<Integer> A2){
    ArrayList<Integer> arr=new ArrayList<Integer>();
    for(int i=0;i<A1.size();i++){
      arr.add(A1.get(i)+A2.get(i));
    }
    return arr;
  }
  final static  boolean Check(ArrayList<Integer> A1,ArrayList<Integer> A2){
    if(A1!=null && A2!=null && A1.size()==A2.size()){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> D1=new ArrayList<Integer>();
    ArrayList<Integer> D2=new ArrayList<Integer>();

    D1.add(10);D1.add(11);D1.add(12);D1.add(13);
    D2.add(10);D2.add(11);D2.add(12);D2.add(13);

    if(Check(D1,D2)){
      D2=AddList(D1,D2);
    }

    Display(D2);

  }
}
