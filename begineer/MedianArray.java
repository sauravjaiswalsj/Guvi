import java.util.*;
public class MedianArray{
	public static void main(String[] args){
            Scanner cin = new Scanner(System.in);
            int n=cin.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=cin.nextInt();
	}
	Arrays.sort(arr);
	int loc=((n-1) - 0)/2;
	int median=arr[loc];
	System.out.println(median);
	}
}

