import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       int count=0;
       
      //  x=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%k==0)
            {
                count++;
            }
        }
        //x[i]=sc.nextInt();
        //for(i=0;i<n;i++)
             System.out.print(count);
    }
}