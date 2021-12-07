import java.util.Scanner;

public class Maindatatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayaç değeri için pozitif bir sayı giriniz: ");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                System.out.print("Hangi veri tiplerinin içine sığacağı sorgulanan sayı: ");
                //BigInteger x=sc.nextBigInteger();
                long x=sc.nextLong();
                
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=(-(Math.pow(2,63))) && x<=(Math.pow(2,63)-1))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
