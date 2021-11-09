public class DepositTransferMoney extends BankTransaction {

    @Override
    public void doBusiness() {
        System.out.println("Deposit some money and transfer it to another bank account");
    }
}
