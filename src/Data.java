import java.util.Scanner;

public class Data {
    double dataBought;
    double dataBalance;
    int amt;
    double dataUsed;
    String browse;
    Scanner sca = new Scanner(System.in);

    private void welcome() {
        System.out.println("Welcome to Vicki Yo services." +
                "The available services are: ");
        System.out.println("1. Buy data");
        System.out.println("2. Browse");
        System.out.println("3. Check data balance");
        System.out.println("4. Close");
        byte input= sca.nextByte();
        switch (input) {
            case 1 -> amtBought();
            case 2 -> getBrowse();
            case 3 -> getDataBalance();
            case 4 -> closeMsg();
            default -> System.out.println("Invalid input.");
        }
    }

    private void amtBought() {
        System.out.println("How much data are you getting? ");
        amt= sca.nextInt();
        dataBought=amt/10;
        System.out.println("You have bought $"+amt+" worth of data.");
        System.out.println("Now you have "+dataBought+"MB");
        System.out.println("Do you wanna continue or log off?");
        System.out.println("Enter 1 to continue, 2 to log off.");
        byte input=sca.nextByte();
        switch (input) {
            case 1 -> welcome();
            case 2 -> System.out.println("Thank you for your time. See you again.");
            default -> System.out.println("Invalid input");
        }
    }

    public String getBrowse() {
        int min;
        System.out.println("How long in minutes do you want to browse?");
        min= sca.nextInt();
        dataUsed=(min/dataBought)*100;
        System.out.println("Now, you're browsing..");
        System.out.println("Do you wanna continue or log off?");
        System.out.println("Enter 1 to continue, 2 to log off.");
        byte input=sca.nextByte();
        switch (input) {
            case 1 -> welcome();
            case 2 -> System.out.println("Thank you for your time. See you again.");
            default -> System.out.println("Invalid input");
        }
        return browse;
    }

    public double getDataBalance() {
        dataBalance=dataBought-dataUsed;
        System.out.println("Your data balance is "+dataBalance+"MB");
        System.out.println("Do you wanna continue or log off?");
        System.out.println("Enter 1 to continue, 2 to log off.");
        byte input=sca.nextByte();
        switch (input) {
            case 1 -> welcome();
            case 2 -> System.out.println("Thank you for your time. See you again.");
            default -> System.out.println("Invalid input");
        }
        return dataBalance;
    }

    private void closeMsg() {
        System.out.println("Thank you for time. You're free to go.");
    }

    public static void main(String[] args) {
        Data dat = new Data();
        dat.welcome();
    }
}
