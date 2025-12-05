public class BTsubstring1{
    public static void substrings(String str,int index,int current){
        if(index==str.length()){
            System.out.println(current);
            return;
        }
        substrings(str,index+1,current+str.charAt(index));
        substrings(str,index+1,current);

    }
        
    public static void main(String[] args){
        String str="abc";
        substrings(str , 0 , ' ');
    }
}