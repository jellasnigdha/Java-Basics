include java.util.Scanner;
public class Primenumber {
  public static void main(String[]args) (

  Scanner sc = new Scanner(System.in);
 int n = nextInt();
  boolean prime = True ;
  if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
