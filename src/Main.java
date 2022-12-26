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
        int a = 50000;
        System.out.println(a);
        byte b = 100;
        System.out.println(b);
        short c = 555;
        System.out.println(c);
        long d = 100000;
        System.out.println(d);
        float e = 7.35f;
        System.out.println(e);
        double f = 4.59449;
        System.out.println(f);



    }

    public static void task2() {
        System.out.println("Задача 2");

        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);


    }

    public static void task3() {
        System.out.println("Задача 3");
        byte teacher1Pupils = 23;
        byte teacher2Pupils = 27;
        byte teacher3Pupils = 30;
        int sheetsOfPaper = 480;
        int numbersOfSheets = sheetsOfPaper / (teacher1Pupils + teacher2Pupils + teacher3Pupils);
        System.out.println("На каждого ученика рассчитано " + numbersOfSheets + " листов бумаги" );
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottlesPer2Minutes = 16;
        int bottlesPer1Minute = bottlesPer2Minutes / 2;
        System.out.println(bottlesPer1Minute);
        int bottlePer20Minutes = bottlesPer1Minute * 20;
        System.out.println("За 20 минут машина произвела " + bottlePer20Minutes + " штук бутылок");
        int bottlesPer1Hour = bottlesPer1Minute * 60;
        System.out.println(bottlesPer1Hour);
        int bottlesPer1Day = bottlesPer1Minute * bottlesPer1Hour;
        System.out.println("За сутки машина произвела " + bottlesPer1Day + " штук бутылок");
        int bottlesPer3Days = bottlesPer1Hour * 72;
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        int bottlesPer1Month = bottlesPer1Day * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesPer1Month + " штук бутылок");


    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaints = 120;
        System.out.println("Всего куплено " + totalPaints + " банок краски");
        byte whitePaintFor1Classroom = 2;
        byte brownPaintFor1Classroom = 4;
        int paintFor1Classroom = whitePaintFor1Classroom + brownPaintFor1Classroom;
        System.out.println("Для одного класса необоходимо " + paintFor1Classroom + " банок краски");
        int totalClassrooms = totalPaints / paintFor1Classroom;
        System.out.println("Всего классов в школе " + totalClassrooms);
        int totalWhitePaints = totalClassrooms * whitePaintFor1Classroom;
        System.out.println("Для одного класса было куплено " + totalWhitePaints + " банок белой краски");
        int totalBrownPaints = totalClassrooms * brownPaintFor1Classroom;
        System.out.println("Для одного класса было куплено " + totalBrownPaints + " банок коричневой краски");
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalWhitePaints + " банок белой краски и " + totalBrownPaints + " коричневой краски" );

    }

    public static void task6() {
        System.out.println("Задача 6");
        byte oneBanana = 80;
        byte totalBananas = 5;
        int totalGramsBananas = oneBanana * totalBananas;
        System.out.println("Бананы весят " + totalGramsBananas + " грамм");
        short in100MillilitresMilk = 105;
        int in200MillilitresMilk = in100MillilitresMilk * 2;
        System.out.println( "В двусхтах миллилитрах молока " + in200MillilitresMilk + " грамм");
        byte inOneBriquette = 100;
        byte totalBriquettes = 2;
        int totalGramsInIceCream = inOneBriquette * totalBriquettes;
        System.out.println("В двух брикетах мороженого " + totalGramsInIceCream + " грамм");
        byte totalEggs = 4;
        byte weightOneEgg = 70;
        int totalGramsInEggs = totalEggs * weightOneEgg;
        System.out.println("Общая масса яиц равна " + totalGramsInEggs + " граммов");
        int weightBreakfastInGrams = totalGramsBananas + totalGramsInIceCream + in200MillilitresMilk + totalGramsInEggs;
        System.out.println("Масса спортзавтрака равна  " + weightBreakfastInGrams + " граммов");
        float inOneKilogram = 1000f;
        float weightBreakfastInKilograms = weightBreakfastInGrams / inOneKilogram;
        System.out.println("Масса спортзавтрака равна " + weightBreakfastInKilograms + " килограмм");


    }

    public static void task7() {
        System.out.println("Задача 7");
        byte totalKilograms = 7;
        short firstProgram = 250;
        short gramsInOneKilogram = 1000;
        int totalDaysForFirstProgram = totalKilograms * (gramsInOneKilogram / firstProgram);
        System.out.println("Для похудения по первой программе, спортсмену необходимо " + totalDaysForFirstProgram + " дней");
        short secondProgram = 500;
        int totalDaysForSecondProgram = totalKilograms * (gramsInOneKilogram / secondProgram);
        System.out.println("Для похудения по второй программе, спортсмену необходимо " + totalDaysForSecondProgram + " дней");
        int averageNumbersOfDays = (totalDaysForFirstProgram + totalDaysForSecondProgram) / 2;
        System.out.println("Спортсмену понадобится в среднем " + averageNumbersOfDays + " день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mariaSalary = 67760;
        byte salaryIncrease = 10;
        byte totalPercent = 100;
        int newMariaSalary = mariaSalary + ((mariaSalary * salaryIncrease) / totalPercent);
        System.out.println("Зарплата Маши после повышения равна " + newMariaSalary);
        byte monthInOneYear = 12;
        int oldAnnualIncome1 = mariaSalary * monthInOneYear;
        System.out.println("Годовой доход Маши до повышения равен " + oldAnnualIncome1);
        int newAnnualIncome1 = newMariaSalary * monthInOneYear;
        System.out.println("Годовой доход Маши после повышения равен " + newAnnualIncome1);
        int differenceBeforeAndAfter1 = newAnnualIncome1 - oldAnnualIncome1;
        System.out.println("Маша теперь получает " + newMariaSalary + " рублей. Годовой доход вырос на " + differenceBeforeAndAfter1 + " рублей.");
        int denisSalary = 83690;
        int newDenisSalary = denisSalary + ((denisSalary * salaryIncrease) / totalPercent);
        System.out.println("Зарплата Дениса после повышения равна " + newDenisSalary);
        int oldAnnualIncome2 = denisSalary * monthInOneYear;
        System.out.println("Годовой доход Дениса до повышения равен " + oldAnnualIncome2);
        int newAnnualIncome2 = newDenisSalary * monthInOneYear;
        System.out.println("Годовой доход Дениса после повышения равен " + newAnnualIncome2);
        int differenceBeforeAndAfter2 = newAnnualIncome2 - oldAnnualIncome2;
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + differenceBeforeAndAfter2 + " рублей");
        int kristinaSalary = 76230;
        int newKristinaSalary = kristinaSalary + ((kristinaSalary * salaryIncrease) / totalPercent);
        System.out.println("Зарплата Кристины после повышения равна " + newKristinaSalary);
        int oldAnnualIncome3 = kristinaSalary * monthInOneYear;
        System.out.println("Годовой доход Кристины до повышения равен " + oldAnnualIncome3);
        int newAnnualIncome3 = newKristinaSalary * monthInOneYear;
        System.out.println("Годовой доход Кристины после повышения равен " + newAnnualIncome3);
        int differenceBeforeAndAfter3 = newAnnualIncome3 - oldAnnualIncome3;
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + differenceBeforeAndAfter3 + " рублей");

    }

}
