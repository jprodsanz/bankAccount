import java.util.Random;

public class BankAccount {

    // static methods belonging to the class
        public static int numberAccounts = 0;
        public static int totalFunds = 0;
        
        private double checkingBal;
        private double savingsBal;

    // rest of code 
        public double getCheckingBal() {
            return this.checkingBal;
        }
        public double getSavingsBal() {
            return this.savingsBal;
        }

    public void depositMoney(double amount, String account) {
        if (account.equals("savings"))
            this.savingsBal += amount;
        else if (account.equals("checking"))
            this.checkingBal += amount; 
        BankAccount.totalFunds += amount;
    }
    public void withdrawMoney(double amount, String account) {
            boolean success = false; 
                if(account.equals("savings")) {
                    if(this.savingsBal - amount >= 0 ) {
                        success = true; 
                        this.savingsBal -= amount; 
                    }
                }
                else if(account.equals("checking")) {
                    if(this.checkingBal - amount >= 0 ) {
                        success = true; 
                        this.checkingBal -= amount; 
                    }
                }
                if(success) {
                    BankAccount.totalFunds -= amount; 
                }
                else{
                    System.out.println("You have insufficient funds.");
                }
    }
                public void displayBalance() {
                    System.out.println(String.format
                    ("Savings Balance: %.2f, Checking Balance: %.2f", 
                    this.savingsBal, this.checkingBal));
                }
}