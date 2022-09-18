public class Main {
    public static void main(String[] args) {
        //task1
        byte a = 12;
        short b = 1290;
        int c = -123456789;
        long d = 122333533466465L;
        float e = 12.3f;
        double f = 123.2421;
        char g = 'a';
        boolean h = a>134;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Значение переменной g с типом char равно " + g);
        System.out.println("Значение переменной h с типом boolean равно " + h);

        // task2
        e = 27.12f;
        d = 987678965549L;
        f = 2.786;
        h = false;
        b = 569;
        c = -159;
        int i = 27897;
        byte j = 67;
        //task3
        int class1StudentsAmount = 23;
        int class2StudentsAmount = 27;
        int class3StudentsAmount = 30;
        int amountSheets = 480;
        int sheetsForOneStudent = amountSheets/(class1StudentsAmount+class2StudentsAmount+class3StudentsAmount);
        System.out.println("На каждого ученика рассчитано "+sheetsForOneStudent+" листов бумаги.");
        // task4
        int bottleAmountInOneMinute = 8;
        System.out.println("За 20 минут машина произвела " + (bottleAmountInOneMinute * 20)+ " бутылок");
        System.out.println("За сутки машина произвела " + (bottleAmountInOneMinute * 24*60)+ " бутылок");
        System.out.println("За 3 суток машина произвела " + (bottleAmountInOneMinute * 24*60*3)+ " бутылок");
        System.out.println("За месяц машина произвела " + (bottleAmountInOneMinute * 24*60*30)+ " бутылок");
        //task5
        int dyeForOneClass = 6;
        int classAmount = 120/dyeForOneClass;
        int whiteDye = classAmount*2;
        int brownDye = classAmount*4;
        System.out.println("В школе, где "+classAmount+ " классов, нужно " + whiteDye+" банок белой краски и "+brownDye+" банок коричневой краски");
        //task6
        int bananas = 5;
        byte oneBananaWeight = 80;
        int bananasWeight = bananas * oneBananaWeight;
        int milk = 200;
        int milkWeight = milk / 100 * 105;
        int iceCream = 2;
        byte iceCreamPack = 100;
        int iceCreamWeight = iceCream * iceCreamPack;
        int eggs = 4;
        byte oneEggWeight = 70;
        int eggsWeight = eggs * oneEggWeight;
        int totalProductsWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalProductsWeightInKilo = totalProductsWeight/1000F;
        System.out.println("Суммарный вес продуктов для одного завтрака составляет " + totalProductsWeight + " гр. или "+ totalProductsWeightInKilo + " кг." );

        int totalWeightLoss = 7;
        float dailyLoss = 0.25F;
        int maxDaysAmount = (int) (totalWeightLoss / dailyLoss);
        System.out.println("При потере 250 гр. веса в день, потребуется " + maxDaysAmount + " суток.");

        float dailyBigLoss = 0.5F;
        int minDaysAmount = (int) (totalWeightLoss / dailyBigLoss);
        System.out.println("При потере 500 гр. веса в день, потребуется " + minDaysAmount + " суток.");

        float averageAmount = (float) (maxDaysAmount + minDaysAmount)/2;
        System.out.println("Среднее количество суток для похудения на 7 кг - " + averageAmount);


        int maryCurrentWage = 67760;
        int denCurrentWage = 83690;
        int kristinaCurrentWage = 76230;
        float totalRise = 1.1F;
        int maryNextWage = (int) (maryCurrentWage * totalRise);
        int maryYearDifference = (int) (maryCurrentWage * totalRise * 12 - maryCurrentWage * 12);
        System.out.println("Маша теперь получает " + maryNextWage + " рублей. Годовой доход вырос на " + maryYearDifference + " рублей.");
        int denNextWage = (int) (denCurrentWage * totalRise);
        int denYearDifference = (int) (denCurrentWage * totalRise * 12 - denCurrentWage * 12);
        System.out.println("Денис теперь получает " + denNextWage + " рублей. Годовой доход вырос на " + denYearDifference + " рублей.");
        int kristinaNextWage = (int) (kristinaCurrentWage * totalRise);
        int kristinaYearDifference = (int) (kristinaCurrentWage * totalRise * 12 - kristinaCurrentWage * 12);
        System.out.println("Кристина теперь получает " + kristinaNextWage + " рублей. Годовой доход вырос на " + kristinaYearDifference + " рублей.");



    }
}