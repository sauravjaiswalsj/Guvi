import java.util.*;
public class prime{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		primeChecker get=new primeChecker();
		long n=cin.nextInt();
		if(get.PrimeChecker(n)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
class primeChecker{
	boolean PrimeChecker(long n){
		for(int i=2;i<n;++i){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
