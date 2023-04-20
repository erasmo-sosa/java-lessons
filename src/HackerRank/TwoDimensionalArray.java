package HackerRank;
/*
Copy/Paste below matrix in the console
 
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
*/
import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;



public class TwoDimensionalArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
            //System.out.println(arrRowItems);
        }

        bufferedReader.close();
     
        // i = row
        // j = column
        int MaxHourGlassSum = -69;
        for(int i=0;i < arr.size() - 2; i++){
        	for(int j=0; j < arr.size() - 2; j++ ) {
            //System.out.println(arr.get(i).get(j));
            int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
            									arr.get(i + 1).get(j + 1) +
            				arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
            System.out.println(currentSum);
            if(currentSum > MaxHourGlassSum) {
            	MaxHourGlassSum = currentSum;
            }
        	}
        }
        System.out.println("--------------MaxHourGlassSum--------------");
        System.out.println(MaxHourGlassSum);
    }
}
