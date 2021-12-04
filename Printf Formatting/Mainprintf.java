import java.util.Scanner;

public class Mainprintf {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);//"%-15s", 15 boşluk içinde "s1" Dizesinin solda doldurulacağı anlamına gelir. (soldan boşlukları doldurun) "%03d", 3 0s içinde "x" tamsayısının sağ tarafa doldurulacağı anlamına gelir.(sağdan sıfırları doldurun).
            }
            System.out.println("================================");
            

    }
}