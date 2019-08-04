import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
public class indexArray{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			map.put(i,val);
		}
		Iterator<Map.Entry<Integer,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer,Integer> i=itr.next();
			System.out.println(i.getValue()+" "+i.getKey());
		}
	}
}
