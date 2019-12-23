public class LegalEntity extends Client {

    public LegalEntity(Double money){
       moneyAmount = money;
    }

    @Override
    public void putMoney(Double money) {
        moneyAmount += money;
    }

    @Override
    public void withdrawMoney(Double money) {
        if(money > (money*0.01 + moneyAmount)){
            System.out.println("Недостаточно средств на счету для продолжения операции.");
        }
        else {
            moneyAmount = moneyAmount - money - money * 0.01;
        }
    }
}
