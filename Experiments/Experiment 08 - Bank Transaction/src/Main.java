public class Main {
    public static void main(String[] args) {
        // perform the first transaction which is deposit and transfer money
        BankTransaction transaction = new DepositTransferMoney();
        transaction.performTransaction();

        System.out.println("----------------------------------");

        // perform the second transaction which is withdraw money
        transaction = new WithdrawMoney();
        transaction.performTransaction();
    }
}
