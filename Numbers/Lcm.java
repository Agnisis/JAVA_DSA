import java.util.*;


// hcf=gcd 
// lcd=lcm 

class Lcm {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm;
        int gcd = 1;
        // int i=1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        // while(i<=num1 && i<=num2){
        // if(num1%i==0 && num2%i==0){
        // gcd=i;
        // }
        // i++;
        // }
        lcm = (num1 * num2) / gcd;

        System.out.println("The LCM is " + lcm);
    }

}