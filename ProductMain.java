package OOP;


import java.util.Scanner;

public class ProductMain {
    //method to find productid of the highest priced product
    public static int getHighestPriceProduct(Product[] products) {
        int highestPricepid = products[0].pid;
        double highestprice = products[0].price;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > highestprice) {
                highestprice = products[i].price;
                highestPricepid = products[i].pid;
            }
        }
        return highestPricepid;
    }
    //method to calculate the total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double TotalAmount = 0;
        for (Product p : products) {
            TotalAmount += p.price * p.quantity;
        }
        return TotalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];
        //Accept 5 product from user
        for (int i = 0; i<5; i++) {
            System.out.println("enter productId,Price,quantity for product" + (i + 1) + ":");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
            // finding the productid with highest price
            int highestPricepid = getHighestPriceProduct(products);
            System.out.println("The productid with the highest price:" + highestPricepid);
            double TotalAmountSpent = calculateTotalAmountSpent(products);
            System.out.println("Total amount spent on all product:" + TotalAmountSpent);
    }
}
