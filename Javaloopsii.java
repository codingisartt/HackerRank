import java.util.*;
import java.io.*;


class Javaloopsii{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Sorgu sayısı: ");
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            System.out.println("a değeri: ");
            int a = in.nextInt();
            System.out.println("b değeri: ");
            int b = in.nextInt();
            System.out.println("c değeri: ");
            int n = in.nextInt();
            
            for(int j = 0; j < n; j++){
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();

    }
}