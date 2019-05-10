import java.util.Scanner;
public class Sum_k_number{
	public static final Scanner cin = new Scanner(System.in);
	public static void main(String[] args){
		int n=cin.nextInt();
		int m=cin.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		int sum=0,i=0;
		while(i<m){
			sum+=arr[i];
			i++;
		}
		System.out.println(sum);
	}
}
	
