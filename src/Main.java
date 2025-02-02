public class Main {
    public static void main(String[] args) {
        int creditCardBalance = 5000;
        double interestRate = .17 / 12;
        double monthOneInterest = creditCardBalance * interestRate;
        double monthOneBalance = creditCardBalance + monthOneInterest;
        double monthTwoInterest = monthOneBalance * interestRate;
        double monthTwoBalance = monthOneBalance + monthTwoInterest;
        System.out.println("Your interest rate after one month is " + monthOneInterest + " bringing your balance to " + monthOneBalance + ".");
        System.out.println ("Your interest after two months with no payment is " + monthTwoInterest + " bringing your total balance to " + monthTwoBalance + ".");
    }
}