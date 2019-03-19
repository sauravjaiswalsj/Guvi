import java.util.*;

class oddEvenValidator{
	public void checker(long n){
		if(n%2==0){
			System.out.println("Even");
		}
		else if (n<0){
			System.out.println("invalid");
		}else{
			System.out.println("Odd");
		}
	}
}
class oddEven{
	public static void main(String[] args){
		oddEvenValidator ob=new oddEvenValidator();
		Scanner cin=new Scanner(System.in);
		long n=cin.nextLong();
		ob.checker(n);
	}
}
