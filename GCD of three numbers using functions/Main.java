import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
       int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(gcd_num(n1,n2,n3));
    }
  public static int gcd_num(int n1,int n2,int n3)
  {
    int min_ele,gcd=0;
      if((n1<n2)&&(n1<n3))
        min_ele=n1;
      else if(n2<n3)
        min_ele=n2;
      else
        min_ele=n3;
    while(min_ele>1)
    {
      if(((n1%min_ele==0)&&(n2%min_ele==0)&&(n3%min_ele==0)))
      {
        gcd=min_ele;
        break;
      }
      min_ele--;
    }
      return gcd;
	}
  
}