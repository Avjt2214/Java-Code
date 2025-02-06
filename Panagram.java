/*Program to check given String is Panagram or not?*/
import java.util.*;
class Panagram{
    static void panagram(String s){
        s=s.toLowerCase();
        if(s.length()<26){
            System.out.println("Not Panagram");
            return;
        }
        else{
            for(char ch='a'; ch<='z'; ch++){
                if(s.indexOf(ch)<0){
                    System.out.println("Not Panagram");
                    return;
                }
            }
            System.out.println("Panagram");
        }
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
		panagram(s);
	}
}
