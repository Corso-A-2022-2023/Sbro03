import java.util.Scanner;
public class MediaInput{
	public static void main (String [] args ){
		Scanner input = new Scanner(System.in);
		int n = 1;
		int media = 0;
		int tot = 0;
		int count = 0;
		while(n!=0){
			System.out.println("Insersci il numero :");
			n = input.nextInt();
			if(n!=0){
				tot+=n;
				count++;
			}
		}
		media = tot/count;
		System.out.println((double)(media));
	}
}