public class WithdrawMoney extends BankTransaction {
    @Override
    public void doBusiness() {
        System.out.println("Withdraw 100$ from bank account");
    }
}
