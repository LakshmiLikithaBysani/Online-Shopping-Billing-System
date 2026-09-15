import java.util.Scanner;

class OnlineShoppingBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE SHOPPING BILLING SYSTEM =====");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double subtotal = price * quantity;

        double discount;

        if (subtotal >= 5000) {
            discount = subtotal * 0.10;
        } else if (subtotal >= 3000) {
            discount = subtotal * 0.05;
        } else {
            discount = 0;
        }

        double amountAfterDiscount = subtotal - discount;

        double gst = amountAfterDiscount * 0.18;

        double finalAmount = amountAfterDiscount + gst;

        System.out.println("\n===== SHOPPING BILL =====");
        System.out.println("Customer Name       : " + customerName);
        System.out.println("Product Name        : " + productName);
        System.out.println("Product Price       : " + price);
        System.out.println("Quantity            : " + quantity);
        System.out.println("Subtotal            : " + subtotal);
        System.out.println("Discount            : " + discount);
        System.out.println("Amount After Discount: " + amountAfterDiscount);
        System.out.println("GST (18%)           : " + gst);
        System.out.println("Final Amount        : " + finalAmount);

        sc.close();
    }
}
