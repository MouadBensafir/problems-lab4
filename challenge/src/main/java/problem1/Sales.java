package problem1;
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        // Ask about the number of salespeople
        Scanner scan = new Scanner(System.in);
        System.out.print("How many salespeople are in the company ? ");
        int SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum, max_id, min_id;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        max_id = 0;
        min_id = 0;
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i] > sales[max_id]) {
                max_id = i;
            }
            if (sales[i] < sales[min_id]) {
                min_id = i;
            }
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        // Print the average
        double average = (double) sum / SALESPEOPLE;
        System.out.println("Average sales : " + average);

        // Print the maximum sales number
        System.out.println("Salesperson " + (max_id+1) + " had the highest sale with $"+ sales[max_id]);

        // Print the minimum sales number
        System.out.println("Salesperson " + (min_id+1) + " had the lowest sale with $"+ sales[min_id]);

        // Ask the user to enter a value
        System.out.print("\nEnter an amount : ");
        int amount = scan.nextInt();

        // Print all salespeople with sales exceeding that amount
        int count = 0;
        System.out.println("Salespeople who exceeded $" + amount + " :");
        for (int i=0; i<sales.length; i++) {
            if (sales[i] > amount) {
                System.out.println("- Salesperson " + (i+1) + " with $" + sales[i]);
                count++;
            }
        }
        System.out.println("Exactly " + count + " salespeople have exceeded $" + amount + " in sales.");
    }
}