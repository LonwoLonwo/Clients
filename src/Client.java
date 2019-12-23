public abstract class Client {

    protected double moneyAmount;

    public abstract void putMoney(Double money);

    public abstract void withdrawMoney(Double money);

    public double getMoneyAmount() {
        return moneyAmount;
    }

}
