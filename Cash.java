import java.util.Scanner;

public class Cash {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x = -1;
		while(x<0){
			x = scan.nextFloat();
		}
		float j = x*100;
		int c = 0;

		while(j>0){
			if(j>=25){
				c=c+1;
				j=j-25;
			}
			else if(j>=10){
				c=c+1;
				j=j-10;
			}
			else if(j>=5){
				c=c+1;
				j=j-5;
			}
			else if(j>=1){
				c=c+1;
				j=j-1;
			}

		}
		System.out.println(c);
	}
}