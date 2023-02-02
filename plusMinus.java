import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int n= arr.size();
    double count1=0;
    double count2=0;
    double count3=0;
    for(int i=0;i<n;i++){
        int ele=arr.get(i);
        if(ele<0){
            count1=count1+1;
        }
        else if(ele>0){
            count2=count2+1;
        }
        else{
            count3=count3+1;
        }
    }
    double b = count1/n;
    double a=count2/n;
    double c=count3/n;
    System.out.println(
      String.format("%.6f", a));
      System.out.println(
      String.format("%.6f", b));
      System.out.println(
      String.format("%.6f", c));
      

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
