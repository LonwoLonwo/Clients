public class Individual extends Client {

    public Individual(Double money){
        moneyAmount = money;
    }

    @Override
    public void putMoney(Double money) {
        moneyAmount += money;
    }

    @Override
    public void withdrawMoney(Double money) {
        if(money > moneyAmount){
            System.out.println("Недостаточно средств на счету для продолжения операции.");
        }
        else {
            moneyAmount -= money;
        }
    }
}
