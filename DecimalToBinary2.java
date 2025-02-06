//Write a program for Decimal to Binary Conversion.
import java.util.*;
class DecimalToBinary{
    public static int func(int decimal){
        String binary="";
        int temp=decimal;
        if (temp == 0) {
            return 0;
        }
        while(temp>0){
            binary+=temp%2;
            temp/=2;
        }
        String reversedBinary = "";
        for (int i = binary.length() - 1; i >= 0; i--) {
            reversedBinary += binary.charAt(i);
        }
        return Integer.parseInt(reversedBinary);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();
		System.out.print(func(decimal));
	}
}
