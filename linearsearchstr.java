import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="Banana";
        System.out.println(linearSearch(str));
    }
    public  static String linearSearch(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='A'){
                result=result+'*';
            }else{
            result=result+str.charAt(i);
            }
        }
        return result;
    } 
}