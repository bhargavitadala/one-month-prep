import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
    Collections.sort(arr);
    long min=0;
    long max=0;
    long[] sol=new long[2];
    for(int i=0;i<4;i++){
        int ele=arr.get(i);
        min=min+ele;
    }
    for(int i=1;i<5;i++){
        int ele=arr.get(i);
        max=max+ele;
    }
    sol[0]=min;
    sol[1]=max;
    for(int i=0;i<sol.length;i++){
        System.out.print(sol[i]+" ");
    }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
