
package act1.mean;

import java.util.Scanner;
public class Act1Mean {


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String input = "How many numbers will you input?";
        String invalid = "Not an integer. Try again:";
        
        int arraySize = getInputInteger(scan, input, invalid);
        
        
        int[] values = getInputArrayInts(scan, arraySize);
        double mean = calculateMean(values);
        
        System.out.println("Mean: " + mean);
        
        
        
    }
    
    public static int getInputInteger(Scanner scnr, String promptMsg, String errorMsg){
        System.out.println(promptMsg);
        while (!scnr.hasNextInt()){
            System.out.print(errorMsg);
            scnr.nextLine();
        }
        int n = scnr.nextInt();
        return n;
    }
        
        
        
    public static int[] getInputArrayInts(Scanner scan, int arraySize){    
        
        int[] values = new int[arraySize];
        for (int i=0; i<arraySize; i++){
            String prompt = "Input the " + (i+1) + "th number: ";
            String error = "Not an integer. Try again:";
            values[i] = getInputInteger(scan, prompt, error);
        }
        return values;
    }
    public static float calculateMean(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        float mean = ((float) sum) / ((float) arr.length);
        return mean;
    }
}
