/*Find magical number from 1 to N
A number is magical if: convert to binary, replace all 0 with 1 & all1 with 2
then calculate sum of all digits. That must be an odd number.*/
import java.util.*;
class MagicalNumber {
	public static int count(int n) {
	    int count=0;
		for(int k=1; k<=n; k++) {
		    int sum=0;
		    int i=k;
			while(i>0) {
				int digit=i%2;
                if(digit==0) {
                    sum+=1;
                }
                else{
                    sum+=2;
                }
                i/=2;
			}
			if(sum%2!=0){
			    count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n));
	}
}
