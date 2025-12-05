//different cost chocolates can buy the amount we have..
import java.util.Scanner;
import java.util.Arrays;

public class Greedyalgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the prices:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Amount:");
        int num = sc.nextInt();   // Example: 10 rupees

        // Sort the prices
        Arrays.sort(arr);

        int count = 0;
        int sum = 0;

        for(int price : arr){
            if(sum + price <= num){
                sum += price;
                count++;
            }
        }

        System.out.println("Maximum items you can buy: " + count);
        System.out.println("Total cost: " + sum);
        System.out.println("Remaining money: " + (num - sum));
    }
}
