import java.util.*;
public class Activityselectionwithgreedy{
    public static void main(String[] args){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int n=start.length;
        int lastEnd=end[0];
        System.out.println("Activity 0 ->("+start[0]+","+end[0]+")");
        for(int i=1;i<n;i++){
            if(start[i]>=lastEnd){
                System.out.println("Activity "+i+" ->("+start[i]+","+end[i]+")");
                lastEnd=end[i];
            }
        }
    }
}