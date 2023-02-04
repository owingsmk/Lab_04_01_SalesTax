public class Main {
    public static void main(String[] args) {

        int computerPrice = 1000;
        System.out.println("What is the Price of your computer? ");
        double saleTax = 0.05;
        saleTax = computerPrice * saleTax;
        System.out.println("The sales tax on your computer is "+ saleTax);
        double fullPrice;
        fullPrice = computerPrice + saleTax;
                System.out.print("This is the total price of your computer "+ fullPrice);
    }
}