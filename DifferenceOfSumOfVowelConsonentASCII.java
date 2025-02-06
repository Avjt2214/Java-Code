/*Wap to take input of a string
Then find out sum of ascii value of vowel
And consonant 
And print difference between them
Result must be in positive*/
import java.util.*;
class DifferenceOfSumOfVowelConsonentASCII{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    //s=s.toLowerCase();
	    int v_sum=0, c_sum=0;
	    char[] ch=s.toCharArray();
	    for(int i=0; i<ch.length; i++){
	        if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')){
	            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
	                v_sum+=(int)ch[i];
	            }
	            else{
	                c_sum+=(int)ch[i];
	            }
	        }
	    }
	    int res=v_sum-c_sum;
	    System.out.println(Math.abs(res));
	}
}
