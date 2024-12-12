import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int end = 2_459_000;
        int sum = 0;
        int pay = 15_000;
        int month = 0;
        while (sum < end) {
            sum = sum + sum/100;
            sum = sum + pay;
            month ++;
            System.out.println(" Месяц "+ month + " сумма накоплений равна "+ sum+ " рублей ");
        }
        System.out.println(" Задача 2");
        int num = 0;
        while (num < 10) {
            num ++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (; num >= 1; num --) {
            System.out.print(num+ " ");
        }
        System.out.println();
        System.out.println(" Задача 3");
        int population = 12_000_000;
        int bern = 17;
        int dead = 8;
        int year = 2024;
        for (; year < 2034; year ++) {
        population += population * bern / 1000 - population * dead / 1000 ;
            System.out.println(" Год "+year+ " численность населения составляет "+ population);
        }
        System.out.println(" Задача 4 ");
        int cash = 15_000;
        int bank = 12_000_000;
        double percent = 7D / 100;
        int montnBank = 0;
        while (cash < bank) {
            cash = (int) (cash * (1 + percent));
            montnBank++;
            System.out.println(" Месяц " + montnBank + " сумма накоплений равна " + cash + " рублей");
        }

        System.out.println(" Задача 5 ");
         cash = 15_000;
         bank = 12_000_000;
         percent = 7D / 100;
         montnBank = 0;
            while (cash < bank) {
                cash = (int) (cash * (1 + percent));
                montnBank++;
                if (montnBank % 6 == 0) {
                    System.out.println(" Месяц " + montnBank + " сумма накоплений равна " + cash + " рублей");
                }
            }

                System.out.println(" Задача 6 ");
                cash = 15_000;
                bank = 12_000_000;
                percent = 7D / 100;
                montnBank = 0;
                int months = 12 * 9;
                while (montnBank < months) {
                    cash = (int) (cash * (1 + percent));
                    montnBank++;
                    if (montnBank % 6 == 0) {
                        System.out.println(" Месяц " + montnBank + " сумма накоплений равна " + cash + " рублей");
                    }

                }
        System.out.println("Задача 7");
         int ferstFriday = 3;
         for (int day = ferstFriday; day <= 31; day += 7) {
             System.out.println("Сегодня пятница, " + day+ "-е число. Необходимо подготовить отчет");


        }
         System.out.println("Задача 8.");
         int period = 79;
         int god = 2024;
         int startSeeng = 0;
         int stert = god - 200;
         int finish = god + 100;
         for (int years = startSeeng; years < finish; years += period) {
             if (years > stert) {
                 System.out.println(years);
             }
         }
    }
}