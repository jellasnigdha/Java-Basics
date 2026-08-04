import java.util.Scanner;
public class Palindromenumber
  {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
  int original = n;
  int reverse = 0;
  while (n>0) {
    reverse = resverse * 10+ n % 10;
    n /= 10;
  }
  if(original == reverse)
    System.out.printl("Palindrome");
  else
    System.out.println(" It is not a Palindrome");
}
  }
