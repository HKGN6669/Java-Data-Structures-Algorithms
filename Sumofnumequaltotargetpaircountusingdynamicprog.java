import java.util.*;
public class  Sumofnumequaltotargetpaircountusingdynamicprog{
    public static int sum(int[] arr,int target){
        int n=arr.length;
        int[][] dp=new int[n+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int s=0;s<=target;s++){
                dp[i][s]=dp[i-1][s];
                if(s>=arr[i-1]){
                   dp[i][s]+=dp[i-1][s-arr[i-1]];
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args){
        int[] arr={3,2,5,4,1};
        int target=5;
        System.out.println(sum(arr, target));
    }
}