public class BTsubstring{
    public static void subString(String str,String ans){
        if(str.length()==0){
        System.out.println(ans);
        return;
        }
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            String result=str.substring(0,i)+str.substring(i+1);
            subString(result,ans+s);//function call
        }
    }
    public static void main(String[] args){
        String str="ABC";
        subString(str,"");
    }
}