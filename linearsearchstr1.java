import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="Banana is tasty and yellow color";
        System.out.println(linearSearch(str));
    }
    public  static String linearSearch(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str==result){
                result="Orange";
            }else{
            result=result+str.charAt(i);
            }
        }
        return result;
    } 
}