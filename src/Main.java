public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int OS = 1;
        if (OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int OS = 0;
        int yearOS = 2016;
        if (OS == 1 && yearOS > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && yearOS <= 2015 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 0 && yearOS > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0 && yearOS <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

    }
    public static void task3 (){
        System.out.println("Задача 3");
        int year = 366;
        if (year == 365){
            System.out.println("2021 год не является високосным");
        } else if (year == 366){
            System.out.println("2021 год является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 сутки");
        } else if (deliveryDistance <= 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется 2 суток");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Потребуется 3 суток");
        }else if ( deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
        public static void task5 () {
            System.out.println("Задача 5");
            int monthNumber = 3;

            switch (monthNumber) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }

    }}