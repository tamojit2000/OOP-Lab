class CUSTOMDATA{

  int arr[],pointer=1;

  void initialize(){
    arr=null;
    arr=new int[11];
    arr[0]=0;
    pointer=1;
    //System.out.println("INITIALIZED");
  }

  void insert(int x){
    arr[pointer]=x;
    pointer++;
    arr[0]++;
    //System.out.println("INSERTED");
  }

  void display(){
    for(int i=1;i<=pointer-1;i++){
      System.out.println(arr[i]);
    }
  }

}
