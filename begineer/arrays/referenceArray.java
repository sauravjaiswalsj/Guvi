import java.util.Scanner;
public class referenceArray{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=cin.nextInt();
		}
		change(array);
		for(int i:array){
			System.out.println(i);
		}
	}
	public static void change(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]+=5;
		}
	}
}
