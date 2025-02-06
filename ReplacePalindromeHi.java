/*Wap to take input an sentence 
Then replace all pallindrome words by “hi”

Sample input
mam how r u
Output
hi how hi hi
Sample input
mam how are you
Output
hi how are you
Sample input
Same input
mam 1 bob
Output
hi 1 hi*/
import java.util.*;
class ReplacePalindromeHi{
    public static String replace_palindrome(String s){
        String result="";
        String[] word=s.split(" ");
        for(int i=0; i<word.length; i++){
            boolean isPalindrome = true;
            for(int j=0; j<=word[i].length()/2; j++){
                if(word[i].charAt(j)!=word[i].charAt(word[i].length()-j-1)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                word[i]="hi";
            }
            result+=word[i]+" ";
        }
        return result.trim();
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
		System.out.println(replace_palindrome(s));
	}
}