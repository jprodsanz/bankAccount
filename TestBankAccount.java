class TestBankAccount {
    public static void main (String[] args) {
        BankAccount chase = new BankAccount();
            System.out.println
            ("Welcome to chase Banking, we are working on your account number") ;
                
                chase.depositMoney(60.00, "checking");
                chase.depositMoney(40.00, "savings");
                chase.displayBalance();
            
            System.out.println(BankAccount.totalFunds);
                
                chase.withdrawMoney(30.00, "checking");
                chase.withdrawMoney(20.00, "savings");
                chase.displayBalance();
    }
}