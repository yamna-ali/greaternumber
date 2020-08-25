import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    /*
    Write a program which gets three numbers from the user and prints out the smallest and largest number.  Use below code and add rest of code to complete the program.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87

The smallest number: 25
The largest number: 87
     */
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int num1=in.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2=in.nextInt();
        System.out.println("Input the 3rd number: ");
        int num3=in.nextInt();



        if (num1 > num2 && num1 > num3){
            System.out.println("The largest number is: "+ num1);
        }
        else if (num2 > num3 && num2 > num1){
        System.out.println("The largest number is:  " + num2);
        }
        else if(num3 > num1 && num3 > num1 ){
            System.out.println("The largest number is: "+ num3);
        }else
        { System.out.println("you did something wrong");}


        if(num1 < num2 && num1 < num3){
            System.out.println("The smallest number is: "+ num1);
        }
        else if (num2 < num3 && num2 < num1){
            System.out.println("The smallest number is:  " + num2);
        }
        else if(num3 < num1 && num3 < num1 ){
            System.out.println("The smallest number is: "+ num3);
        }else
            System.out.println("you did something wrong");
}}