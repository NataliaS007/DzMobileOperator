public class Main {
    public static void main(String[] args){
        int score = 57;//Начальная сумма на счету клиента
        int depositAccount = 1730; //Сумма пополнения
        int bonus;
        int balance;

        if (depositAccount > 1000) { //Проверка, превысила ли сумма пополнения порог
            bonus = depositAccount / 100;//Расчет суммы бонуса
        } else {
            bonus = 0;
        }
        balance = score + depositAccount;
        System.out.println("Итоговый счет: " + balance + " руб.");
        System.out.println("Бонусные рубли: " + bonus + " руб.");
    }
}