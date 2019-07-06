import java.util.Scanner;
public class DisplayOdd{
	public static void main(String[] args){
		Scanner cin= new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		for(int i=a+1;i<b;++i){
			if((i & 1 )==1){
				System.out.print(i+" ");
			}
		}
	}
}
