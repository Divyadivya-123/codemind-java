
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    if(n==1){
		        if(x%2==0){
		            System.out.println("Even");
		        }
		        else{
		             System.out.println("Odd");
		        }
		    }
		    else{
		        if(x%2==1){
		            if(n%2==0){
		                 System.out.println("Even");
		            }
		            else{
		                 System.out.println("Odd");
		            }
		        }
		        else{
		             System.out.println("Impossible");
		        }
		    }
		}
	}
}
