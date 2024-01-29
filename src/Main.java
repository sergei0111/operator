public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;

        int depositedAmount = 1100;

        int bonus;
        if (depositedAmount > 1000) {
            bonus = depositedAmount / 100;
        } else {
            bonus = 0;
        }
        int summ = initialAmount + depositedAmount + bonus;
        System.out.println("Баланс стал:" + summ);
        System.out.println("Бонусы:" + bonus);

    }
}
