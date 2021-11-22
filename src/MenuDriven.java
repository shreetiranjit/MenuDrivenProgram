import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Menu Driven Program");
        System.out.println("-------------------");
        System.out.println("1. Add two numbers");
        System.out.println("2. Simple Interest");
        System.out.println("3. Palindrome Number");
        System.out.println("4. Odd Even");

        System.out.print("Enter your choice (1,2,3,4):");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                System.out.print("Enter the first number:");
                int first_number = sc.nextInt();
                System.out.print("Enter the second number:");
                int second_number = sc.nextInt();

                int result = (first_number+second_number);
                System.out.print("The sum of " + first_number + "and" + second_number +"is" + result);
                break;
            case 2 :
                System.out.print("Enter the principle:");
                double principle = sc.nextInt();
                System.out.print("Enter the time:");
                double time = sc.nextInt();
                System.out.print("Enter the rate:");
                double rate =  sc.nextInt();

                double simple_interest = (principle * time * rate) / 100 ;
                System.out.print("The simple interest is" +  simple_interest);
                break;

            case 3 :
                System.out.print("Enter the number to check whether it's palindrome or not:");
                int number = sc.nextInt();
                int remainder = number % 10 ;
                int quotient = number / 10 ;
                int p_check = remainder * 10 + quotient;

                if (p_check == number) {
                    System.out.print(number + " is a palindrome.");
                }
                else{
                    System.out.print(number + " is not a palindrome.");
                }
                break;

            case 4 :
                System.out.print("Enter the number to check whether it's odd and even:");
                int check = sc.nextInt();

                if (check % 2 == 0){
                    System.out.print("Even");
                }
                else {
                    System.out.print("Odd");
                }
                break;

            default:
                System.out.print("Invalid");


        }
    }
}
