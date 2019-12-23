public class SoleProprietor extends Client {

    public SoleProprietor(Double money){
        moneyAmount = money;
    }

    @Override
    public void putMoney(Double money) {
        moneyAmount = money >= 1000 ? moneyAmount + money - money*0.005
                                    : moneyAmount + money - money*0.01;
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
