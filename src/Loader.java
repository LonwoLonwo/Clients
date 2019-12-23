public class Loader {
    public static void main(String[] args) {
        Individual indiClient = new Individual(100.0);
        indiClient.putMoney(300.0);
        System.out.println(indiClient.getMoneyAmount());
        indiClient.withdrawMoney(100.0);
        System.out.println(indiClient.getMoneyAmount());

        LegalEntity legalClient = new LegalEntity(1000.0);
        legalClient.putMoney(1000.0);
        legalClient.withdrawMoney(1000.0);
        System.out.println(legalClient.getMoneyAmount());

        SoleProprietor soleClient = new SoleProprietor(5000.0);
        soleClient.putMoney(500.0);
        System.out.println(soleClient.getMoneyAmount());
        soleClient.putMoney(1000.0);
        System.out.println(soleClient.getMoneyAmount());
        soleClient.withdrawMoney(10000.0);
    }
}
