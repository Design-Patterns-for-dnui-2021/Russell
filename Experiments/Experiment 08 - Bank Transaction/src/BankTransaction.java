public abstract class BankTransaction {
    public final void performTransaction() {
        getNumber();
        doBusiness();
    }

    public void getNumber() {
        System.out.println("Get & queue depositors account number...");
    }

    public abstract void doBusiness();
}
