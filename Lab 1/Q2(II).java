import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int k=0;k<i;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=i;j<=n;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
