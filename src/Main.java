public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int month = 0;
        int donate = 15_000;
        while (total < 2_459_000){
            total = total + donate;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 1;
        while(num < 11){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 12_000 * 17;
        int deathRate = 12_000 * 8;
        for(int i = 0; i < 11; i++){
            population = population + (birthRate - deathRate);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15_000;
        int month = 0;
        while(sum < 12_000_000){
            sum =sum + sum * 7/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + sum);
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15_000;
        int month = 0;
        while(sum < 12_000_000) {
            sum = sum + sum * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + sum);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15_000;
        int month = 0;
        while(month < 9*12) {
            sum = sum + sum * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + sum);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int date = 5;
        while(date < 32){
            System.out.println("Сегодня пятница, " + date +"-е число. Необходимо подготовить отчет");
            date = date + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 2020;
        int pastVisits = startYear + 200;
        while(startYear < pastVisits){
            System.out.println(startYear);
            startYear = startYear + 79;
        }
        int futureVisits = pastVisits + 100;
        while(startYear < futureVisits){
            System.out.println(startYear);
            startYear = startYear + 79;
        }
    }
}