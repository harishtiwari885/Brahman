import java.util.*;
public class ForLoop {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = j.nextInt();
        for(int b = 1 ; b <= a ; b++){
            System.out.print(b + " ");
        }
        System.out.println();
        int sum = 0;
        for(int d = 1 ; d <= a ; d++){
            sum += d;
        }
        System.out.println("The Sum of: " + a + " is: " + sum);
    }
}
