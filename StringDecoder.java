/*String decoder
given string as series of 0&1; 
A=1, B=11; C=111,.......Z=1111....11(26 1s)
0s are seperator*/
import java.util.*;
class StringDecoder{
    static String decoder(String s){
        char[] ch=s.toCharArray();
        String x="";
        int count=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='1'){
                count++;
            }
            else if(ch[i]=='0'){
                if(count>0){
                    x+=(char)('A'+(count-1))+" ";
                    count=0;
                }
            }
        }
        if(count>0){
            x+=(char)('A'+(count-1))+" ";
        }
        return x;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(decoder(s));
	}
}
