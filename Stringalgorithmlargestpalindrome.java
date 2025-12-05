import java.util.*;
public class Stringalgorithmlargestpalindrome{
    public static boolean pal(String str){ //pal=palindrome
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str="ababadabacabddabacabaabcdabc";
        String temp="";
        for(int i=1;i<str.length()-1;i++){
            for(int j=i;j<str.length()-1;j++){
                String sub=str.substring(i,j+1);
                if(pal(sub) && sub.length()>temp.length()){
                    temp=sub;
                }
            }
        }
        System.out.println("largest palindrome is : "+temp);
    } 
}