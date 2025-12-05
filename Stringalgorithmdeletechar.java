import java.util.*;
public class Stringalgorithmdeletechar{
    public static void main(String[] args){
        String str="mmississippi";
        String res="";
        for(int i=0;i<str.length()-1;i++){
            if(i>0 && str.charAt(i)==str.charAt(i-1)){
                continue;
            }
            res=res+str.charAt(i);
        }
        System.out.println(res);
    }
}