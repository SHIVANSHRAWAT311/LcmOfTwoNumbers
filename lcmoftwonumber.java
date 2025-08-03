import java.util.Scanner;
public class lcmoftwonumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int lcm = (a>b)? a:b;
        while (true){
            if(lcm % 2==0 && lcm % b == 0){
                System.out.println("lcm="+lcm);
                break;

            }
            lcm++;


        }

    }

}
