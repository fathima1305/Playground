import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int ans = n*n;
    return ans;
  }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ans = square(n);
      System.out.println(ans);
	} 
}