import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        int ii=0,ss=0,dd=0;
        boolean sflag=true, iflag=true;
        String[] sen2=sentence.split(" ");
        for(int i=0;i<sen2.length;i++){
            try{
                Integer d=Integer.parseInt(sen2[i]);
            }
            catch(NumberFormatException ex1){
                iflag=false;
            }
            if(iflag==false){
                try{
                    Double g=Double.parseDouble(sen2[i]);
                }
                catch(NumberFormatException ex){
                    sflag=false;
                }
            }
            if(iflag) ii+=1;
            if(sflag==true && iflag==false) dd+=1;
            if(sflag==false) ss+=1;
            iflag=true;
            sflag=true;
        }
        System.out.println("String "+ss);
        System.out.println("Integer "+ii);
        System.out.println("Double "+dd);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}


