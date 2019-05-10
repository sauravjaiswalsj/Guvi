import java.util.Scanner;
public class Sum_Naturalnumber{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int sum=(n*(n+1))/2;
		System.out.println(sum);
	}
}
