public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;

        int depositedAmount = 1005;

        int bonus;
        if (depositedAmount > 1005) {
            bonus = depositedAmount/100;
        } else {
            bonus = 0;
        }
        bonus = depositedAmount / 100;
        int summ = initialAmount + depositedAmount + bonus;
        System.out.println("Баланс стал:" + summ);
        System.out.println("Бонусы:" + bonus);

    }
}
