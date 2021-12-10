import java.util.Scanner;

public class End_of_file{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*for(int i =1; scanner.hasNext(); i++){    **first way
            System.out.println(i+" "+scanner.nextLine());
        }*/
         
        //second way
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.println(++i + " " + sc.nextLine());
        }

    }
}