class Factorial {

 int num;

 void getNumber() {

 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a number: ");

 num = sc.nextInt();

 }

 void findFactorial() {

 int fact = 1;

 for (int i = 1; i <= num; i++) {

 fact = fact * i;

 }

 System.out.println("Factorial of " + num + " = " + fact);

 }

}

public class Main {

 public static void main(String[] args) {

 Factorial f = new Factorial();

 f.getNumber();

 f.findFactorial();

 }

}
