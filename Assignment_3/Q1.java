import java.text.DecimalFormat;

class Q1{
  public static void main(String[] args) {

    float arr[],tmp,sum=0;
    int i,j,n=args.length;

    DecimalFormat dFormat=new DecimalFormat("##.00");
    arr=new float[100];

    for(i=0;i<n;i++){
      arr[i]=Float.parseFloat(args[i]);
    }

    for(i=0;i<n-1;i++){
      for(j=i+1;j<n;j++){
        if(Float.compare(arr[i],arr[j])==1){
          tmp=arr[i];
          arr[i]=arr[j];
          arr[j]=tmp;;
        }
      }
    }



    for(i=0;i<n;i++){
      System.out.println(dFormat.format(arr[i]));
      sum=sum+arr[i];
    }


    System.out.println("Sum:"+dFormat.format(sum));

  }
}
