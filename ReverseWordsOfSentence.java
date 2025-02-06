/*Write a program to reverse the characters in the individual strings*/
import java.util.*;
class ReverseWordsOfSentence{
    public static String rev(String s){
        String revString="";
        String[] words=s.split(" ");
        for(int i=0; i<words.length; i++){
            for(int j=words[i].length()-1; j>=0; j--){
                revString=revString+words[i].charAt(j);
            }
            if (i<words.length-1){
                revString+= " ";
            }
        }
        return revString;
    }
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    String s=sc.nextLine();
		System.out.println(rev(s));
	}
}