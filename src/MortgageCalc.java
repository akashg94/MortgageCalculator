
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {

        //constant value kept it in final
        final byte months_in_year = 12;
        final byte Loan = 100;


        //amount of loan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: " );
       int principal = scanner.nextInt();

       //interest rate
        System.out.print("Annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/Loan/months_in_year;
        //years of loan
        System.out.print("period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * months_in_year;
        
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/
                (Math.pow(1 + monthlyInterest, numberOfPayments)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage " + mortgageFormatted);
    }
}
