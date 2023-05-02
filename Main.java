import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.Write a program that prints the numbers from 1 to 100 such that:
        for (int i=1; i<=100; i++)
        {
            if (i % 3 == 0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }

            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }

            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }

        }

        //2.Write a Java program to reverse a string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q2: Enter Any String : ");
        String name = scanner.nextLine();
        String reverse="";
        char ch;

        System.out.println("Original word: "+name);

        for (int i=0; i<name.length(); i++)
        {
            ch= name.charAt(i);
            reverse= ch+reverse;
        }
        System.out.println("Reversed word: "+ reverse);

        //3.Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.

        System.out.println("Q3: Enter a Positive Number: ");
        int posnum =scanner.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(posnum+"*"+i+"="+posnum*i);
        }

        //4.Write a program to find the factorial value of any number entered through the keyboard.
        System.out.println("Q4: Enter Any Numer to Find Its Factorial: ");
        int facnum=scanner.nextInt();
        int fact=1;

        for(int i=1;i<=facnum;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+facnum+" is: "+fact);

        //5.Two numbers are entered through the keyboard. Write a program to find the value
        // of one number raised to the power of another. (Do not use Java built-in method)

        System.out.println(" Q5: Enter two numbers to find the power of this num: ");
        int Firstnum = scanner.nextInt();
        int Secnum = scanner.nextInt();

        int Result = 1;

        while (Secnum != 0) {
            Result *= Firstnum;
            --Secnum;
        }

        System.out.println(" The Answer is = " + Result);


        //6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        System.out.println(" Q6: Enter 2 numbers to find the sum of Even/Odd: ");
        int num1= scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum;
        if (num1 %2 ==0 && num2 %2==0 ){
            sum=num2+num1;
            System.out.println(" The Numbers is Even, This is the result: "+ sum);
        }
        else {
            sum=num2+num1;
            System.out.println(" The Numbers is Odd, This is the result: "+ sum);
        }


        //7.Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a

        System.out.println("Q7: Enter any number to check if it's prime: ");
        int prime= scanner.nextInt();
        if ( prime%2 ==1){
            System.out.println(" your Number "+prime+" is a prime number");
        }
        else {
            System.out.println("your number: "+prime+" is not a prime number");
        }

        //8.Write a program to enter the numbers till the user wants
        // and at the end it should display the count of positive, negative and zeros entered.
        int zcounter=0, pcounter=0, ncounter=0, numb;
        do
        {
            System.out.println("Q8: Enter any numbers, and put 1 to stop ");
            numb = scanner.nextInt();

            if(numb > 0)
            {
                pcounter++;
            }
            else if(numb < 0)
            {
                ncounter++;
            }
            else
            {
                zcounter++;
            }

        } while(numb != 1);

            System.out.println("Positive numbers: " + pcounter);
            System.out.println("Negative numbers: " + ncounter);
            System.out.println("Zero numbers: " + zcounter);

        //9.Use a for loop to print headings for four weeks (Weeks 1 - 4).
        // Then use another for loop to print the days (Days 1 -7) for each week.

        System.out.println("Q9: ");
        for(int q=1 ; q<=4; q++)
        {
            System.out.println("week "+q);
            for(int w=1 ; w<=7; w++)
            {
                System.out.println(" Day "+w);
            }

        }

        //10.Write a program thats check if the word is a palindrome or not. hint:
        // A string is said to be a palindrome if it is the same if we start reading it
        // from left to right or right to left.

        Scanner g=new Scanner(System.in);

        System.out.println(" Q10: Enter any string: ");
        String userstring = g.nextLine();

        String reverseStr = "";


        int strLength = userstring.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + userstring.charAt(i);
        }

        if (userstring.equals(reverseStr) )

        {
            System.out.println(userstring + " is a Palindrome String.");
        }
        else {
            System.out.println(userstring + " is not a Palindrome String.");
        }

    }
}













