import java.util.Scanner;
class ArithemeticProgression{
    public static void main(String[]  args){
        Scanner cin = new Scanner(System.in);
            int N=cin.nextInt();
            int A=cin.nextInt();
            int D=cin.nextInt();
            int sum=(N*(2*A+(N-1)*D))/2;
            System.out.println(sum);
    }
}

