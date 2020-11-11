import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        /*int [] Numbers = {5,6,7,89,10};
        double sum = 0;

        for (int number : Numbers) {

            sum += number;

        }

        double average = sum/Numbers.length;

        System.out.println("The average for numbers:"+ Arrays.toString(Numbers)+ " is " + average );*/

        Scanner input = new Scanner(System.in);

        System.out.println("Pls press size of array");
        int n = input.nextInt();
        int [] numbers = new int[n];

        double sum =0;

        for (int i = 0; i <numbers.length-1 ; i++) {
            numbers[i]= (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {

            sum += number;

        }

        double average = sum/numbers.length;

        System.out.println("The average for numbers:"+ Arrays.toString(numbers)+ " is " + average );

    }
}
