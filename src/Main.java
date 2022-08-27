public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte lemon = 1;
        System.out.println("Значение переменной lemon с типом byte равно " + lemon);
        short dog = 15;
        System.out.println("Значение переменной dog с типом short равно " + dog);
        int house = 1487;
        System.out.println("Значение переменной house с типом int равно " + house);
        long stars = 1598753L;
        System.out.println("Значение переменной stars с типом long равно " + stars);
        float sugarWeight = 3.5F;
        System.out.println("Значение переменной sugarWeight с типом float равно " + sugarWeight);
        double pi = 3.1415;
        System.out.println("Значение переменной pi с типом double равно " + pi);
        System.out.println("Задача 2");
        float number1 = 27.12f;
        long number2 = 987678965549L;
        byte number3 = 2;
        short number4 = 786;
        boolean number5 = false;
        short number6 = 569;
        short number7 = -159;
        int number8 = 27897;
        short number9 = 67;
        System.out.println("Задача 3");
        int classL = 23;
        int classA = 27;
        int classE = 30;
        int paper = 480;
        int paperPerPupil = paper / (classA + classE + classL);
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");
        System.out.println("Задача 4");
        int bootle = 16;
        int time = 2;
        int productivityInMinute = bootle / time;
        int productivity1 = productivityInMinute * 20; // 20 минут
        System.out.println("За 20 минут машина произвела бутылок " + productivity1 + " штук");
        int minutesInDay = 60 * 24; // сутки
        int productivity2 = productivityInMinute * minutesInDay;
        System.out.println("За сутки машина произвела бутылок " + productivity2 + " штук");
        int productivity3 = productivity2 * 3; // 3 дня
        System.out.println("За 3 дня машина произвела бутылок " + productivity3 + " штук");
        int productivity4 = productivity2 * 30;// месяц
        System.out.println("За месяц машина произвела бутылок " + productivity4 + " штук");
        System.out.println("Задача 5");
        int classes = 120 / 6; //кол-во классов
        int white = classes * 2;
        int brown = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
        System.out.println("Задача 6");
        float banan = 80f;
        float milk = 105f;
        float icecream = 100f;
        float egg = 70f;
        float breakfastWeight = banan * 5 + milk * 2 + icecream * 2 + egg * 4;
        float weightKg = breakfastWeight / 1000;
        System.out.println(weightKg);
        System.out.println("Задача 7");
        float weightLost = 7 * 1000;
        float days1 = weightLost / 250; //убывание на 250гр
        System.out.println(days1);
        float days2 = weightLost  / 500; //убывание на 500гр
        System.out.println(days2);
        float days3 = weightLost / (days1 + days2);
        System.out.println(days3);
        System.out.println("Задача 8");
        int mashaPay = 67760;
        int denisPay = 83690;
        int kristinaPay = 76230;
        int plusM = mashaPay / 10 + mashaPay;
        int profitM = plusM * 12 - mashaPay * 12;
        System.out.println("Маша теперь получает " + plusM + " рублей. Годовой доход вырос на " + profitM + " рублей");
        int plusD = denisPay / 10 + denisPay;
        int profitD = plusD * 12 - denisPay * 12;
        System.out.println("Денис теперь получает " + plusD + " рублей. Годовой доход вырос на " + profitD + " рублей");
        int plusK = kristinaPay / 10 + kristinaPay;
        int profitK = plusK * 12 - kristinaPay * 12;
        System.out.println("Кристина теперь получает " + plusK + " рублей. Годовой доход вырос на " + profitK + " рублей");
    }
}