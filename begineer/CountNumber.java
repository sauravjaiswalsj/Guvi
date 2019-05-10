import java.util.Scanner;
public class CountNumber{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		System.out.println(count(n));
	}
	public static int count(int n){
		int i=0;
		while(n!=0){
			n=n/10;
			i++;
		}
		return i;
	}
}
