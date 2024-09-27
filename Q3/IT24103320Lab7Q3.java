import java.util.Scanner;

public class IT24103320Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();
           
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;
                System.out.printf("Amount to be paid: %.2f\n", amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
               
                System.out.printf("Amount to be paid: %.2f\n", billAmount);
            } else {
                
                System.out.println("Payment Mode is Not Valid");
            }
            
            System.out.println();          
	}

    }
}
