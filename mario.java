import java.util.Scanner;

public class mario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Height: ");
		int t = scan.nextInt();
		for(int k = 1; k <= t; k++)
		{
			int i,j;
			for(i = 1 ;i <= t-1;i++)
			{
				System.out.println(" ");
			}
			for(j = 1 ;j < k+2; j++)
			{
				System.out.println("#");
			}
			System.out.println();
		}

	}
}
