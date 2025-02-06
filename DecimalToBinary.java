/*Superior element of array*/
import java.util.*;
class DecimalToBinary{
    static String binary(int n){
        if(n==0){
            return "0";
        }
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n/=2;
        }
        return binary;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(binary(n));
	}
}
