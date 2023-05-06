import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int spaces=n-1;
		for(int i=1;i<=n;i++)
		{
		    for(int k=spaces;k>0;k--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<i;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		    spaces--;
		}
	}
}
