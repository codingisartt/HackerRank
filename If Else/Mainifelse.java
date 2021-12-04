import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Mainifelse{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String result;
        System.out.print("Bir sayı giriniz: ");
        int N = s.nextInt();
        if( N%2 == 0) {
            if( (N >=2 && N <=5) || N > 20) {
                result = "Not Weird";
            } else {
                result = "Weird";
            }
        } else {
            result = "Weird";
        }
        System.out.println(result);
    
    }
}