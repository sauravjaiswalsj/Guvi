import java.util.*;
import java.lang.*;
public class AmstrongNumber{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int num=cin.nextInt();
		if(Amstrong(num)==num){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	public static int Amstrong(int t){
		int sum=0;
		while(t!=0){
			int r=t%10;
			sum=sum+(r*r*r);
			t/=10;
		}
		return sum;
					
	}
}
