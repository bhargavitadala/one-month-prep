import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        String res="";
        boolean[] alphalist= new boolean[26];
        int index=0;
        int flag=1;
        for(int i=0;i<s.length();i++){
            if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
            index = s.charAt(i) - 'A';
         }else if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
            index = s.charAt(i) - 'a';
      }
      alphalist[index] = true;
            
        }
        for (int i = 0; i <= 25; i++) {
      if (alphalist[i] == false)
      flag = 0;
   }
   if(flag==1){
       res=res+"pangram";
   }
   else{
       res=res+"not pangram";
   }
   return res;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
