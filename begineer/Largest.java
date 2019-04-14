import java.util.Scanner;
class Largest{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		int r=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(r);
	}
}
