/*Write a program to calculate the number of vowels present in the string*/
import java.util.*;
class VowelCount{
    public static int countvowel(String s){
        int count=0;
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    String s=sc.nextLine();
		System.out.println(countvowel(s));
	}
}