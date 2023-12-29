import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();

    }

    //Task1
    //Задание 1
    //Реализовать приложение, вычисляющее для последовательности чисел, представляющих собой величины углов, следующие тригонометрические функции:
    //a.   сумма синусов/косинусов значений,
    //b.   разность синусов/косинусов значений,
    //c.   произведение синусов/косинусов введенных значений.
    //Единица измерения углов должна указываться как параметр командной строки программы (градусы или радианы). Для представления единиц измерения используйте константы с типом int. Для хранения значений, необходимо использовать массив с типом double. Объявления методов должны выглядеть следующим образом:
    ///**
    //@param angles – массив значений углов;
    //@param type -единица измерения, имеющее значение од-
    //ной из констант
    //@return сумму синусов значений углов;
    //*/
    //public static double getSumSinuses(double[] angles, int type);
    public static void task1() {
        double[] angles = new double[]{30, 90};
        int type; // 1-degrees, 0 - radians

        System.out.println("SumSinuses = " + getSumSinuses(angles, 1));
        System.out.println("SumCosines = " + getSumCosines(angles, 1));
        System.out.println("SubtractSinuses = " + getSubtractSinuses(angles, 1));
        System.out.println("SubtractCosines = " + getSubtractCosines(angles, 1));
        System.out.println("MultiplySinuses = " + getMultiplySinuses(angles, 1));
        System.out.println("MultiplyCosines = " + getMultiplyCosines(angles, 1));


    }

    public static double getSumSinuses(double[] angles, int type) {
        double sumSinuses = 0;
        for (int i = 0; i < angles.length; i++) {
            if (type == 1) {
                sumSinuses += Math.sin(Math.toRadians(angles[i]));
            } else if (type == 0) {
                sumSinuses += Math.sin(angles[i]);
            } else {
                System.out.println("Вы неверно выбрали размерность углов");
            }
        }
        return sumSinuses;
    }

    public static double getSumCosines(double[] angles, int type) {
        double sumCosines = 0;
        for (int i = 0; i < angles.length; i++) {
            if (type == 1) {
                sumCosines += Math.cos(Math.toRadians(angles[i]));
            } else if (type == 0) {
                sumCosines += Math.cos(angles[i]);
            } else {
                System.out.println("Вы неверно выбрали размерность углов");
            }
        }
        return sumCosines;
    }

    public static double getSubtractSinuses(double[] angles, int type) {
        double subtractSinuses = 0;
        for (int i = 0; i < angles.length; i++) {
            if (type == 1) {
                subtractSinuses -= Math.sin(Math.toRadians(angles[i]));
            } else if (type == 0) {
                subtractSinuses -= Math.sin(angles[i]);
            } else {
                System.out.println("Вы неверно выбрали размерность углов");
            }
        }
        return subtractSinuses;
    }

    public static double getSubtractCosines(double[] angles, int type) {
        double subtractCosines = 0;
        for (int i = 0; i < angles.length; i++) {
            if (type == 1) {
                subtractCosines -= Math.cos(Math.toRadians(angles[i]));
            } else if (type == 0) {
                subtractCosines -= Math.cos(angles[i]);
            } else {
                System.out.println("Вы неверно выбрали размерность углов");
            }
        }
        return subtractCosines;
    }

    public static double getMultiplySinuses(double[] angles, int type) {
        double multiplySinuses = 1;
        for (int i = 0; i < angles.length; i++) {
            if (type == 1) {
                multiplySinuses *= Math.sin(Math.toRadians(angles[i]));
            } else if (type == 0) {
                multiplySinuses *= Math.sin(angles[i]);
            } else {
                System.out.println("Вы неверно выбрали размерность углов");
            }
        }
        return multiplySinuses;
    }

    public static double getMultiplyCosines(double[] angles, int type) {
        double multiplyCosines = 1;
        for (int i = 0; i < angles.length; i++) {
            if (type == 1) {
                multiplyCosines *= Math.cos(Math.toRadians(angles[i]));
            } else if (type == 0) {
                multiplyCosines *= Math.cos(angles[i]);
            } else {
                System.out.println("Вы неверно выбрали размерность углов");
            }
        }
        return multiplyCosines;
    }

    //Task2
    //Задание 2
    //Создать метод вычисляющий факториал. Вычислить факториал достаточно большое
    // количество раз (миллион или больше), сравните эффективность рекурсивного и
    // итерационного алгоритмов. Во сколько раз будет отличаться время выполнения
    // и как это отношение будет зависеть от числа, факториал которого рассчитывается?
    // Программа должна вывести на экран результат анализа.
    public static void task2() {

        int n = 1000;

        long startFactByRec = System.nanoTime();
        factorialByRecursion(n);
        long endFactByRec = System.nanoTime();
        long timeFactByRec = endFactByRec - startFactByRec;

        long startFactByIt = System.nanoTime();
        factorialByIteration(n);
        long endFactByIt = System.nanoTime();
        long timeFactByIt = endFactByIt - startFactByIt;

        System.out.println("timeFactByRec = " + timeFactByRec);
        System.out.println("timeFactByIt = " + timeFactByIt);
        System.out.println("Итерационный алгоритм быстрее в " + (timeFactByRec / timeFactByIt) + " раз");


    }

    public static long factorialByRecursion(int n) {
        long result;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorialByRecursion(n - 1);
        }
        return result;
    }

    public static long factorialByIteration(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }


    //Task3
    //Задание 3
    //Создать метод, который будет сортировать по убыванию  одномерный массив случайных чисел из n
    // элементов, переданный в качестве аргумента в этот метод. Сортировка должна быть устойчивой и
    // иметь естественное поведение. (Не использовать Arrays.sort). Программа должна вывести на экран
    // исходный и отсортированный массив.
    public static void task3() {
        int[] array = new int[]{1, 3, 2, 5, 4, 7, 6, 9, 8, 10};
        print(array);
        sort(array);
        print(array);

    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }


    //Task4
    //Задание 4
    //В массиве хранится n явно заданных текстовых строк.
    // Создать программу, которая отсортирует и выведет на экран строки в алфавитном порядке.
    // Указание: прежде всего надо создать метод, устанавливающий отношения порядка для двух строк,
    // переданных методу через аргументы. Программа должна вывести строки в начальном и отсортированном
    // порядке.(2 балла)
    //Дополнительно 1 балл за генерацию уникальных строк реализованных в виде метода.
    public static void task4() {
        String array[] = {"Петров", "Сидоров", "Иванов"};
//        String array[] = {"собака", "выдра", "кот", "акула"};



        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            if (compare(array[i], array[i + 1]) < 0) {
                String temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static void printStringArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Task5
    //Задание 5
    //Королю нужно убить дракона, но в его казне мало средств для покупки армии. Нужно создать программу используя методы, которая поможет рассчитать минимальное количество копейщиков, которое необходимо, чтобы убить дракона. Данные здоровья и атаки дракона и одного копейщика вводятся с клавиатуры.
    //  Защита, меткость и т. п. не учитывать. Копейщики наносят удар первыми(общий нанесенный урон – это сумма атак всех живых копейщиков). Если атака дракона превышает значение жизни копейщика (например у копейщика жизни 10, а атака 15),  то умирает несколько копейщиков, а оставшийся урон идет одному из копейщиков.
    //Например, жизнь дракона 500, атака 55, жизнь одного копейщика 10, атака 10, а количество копейщиков при данных условиях 20.
    //Лог боя для данного примера должен выглядеть так:
    //Копейщики атакуют (урон 200) – у дракона осталось 300 жизней
    //Дракон атакует – осталось 15 копейщиков, один из которых ранен (осталось 5 жизней)
    //Копейщики атакуют – у дракона осталось 150 жизней
    //Дракон атакует – осталось 9 копейщиков
    //Копейщики атакуют – у дракона осталось 60 жизней
    //Дракон атакует – осталось 4 копейщика , один из которых ранен (осталось 5 жизней)
    // Копейщики атакуют – у дракона осталось 20 жизней
    //Дракон атакует  и побеждает
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите здоровье дракона");
        int dragonHealth = scanner.nextInt();
        System.out.println("Введите атаку дракона");
        int dragonFight = scanner.nextInt();
        System.out.println("Введите здоровье копейщика");
        int spearmanHealth = scanner.nextInt();
        System.out.println("Введите атаку копейщика");
        int spearmanFight = scanner.nextInt();

//        int dragonHealth = 500;
//        int dragonFight = 50;
//        int spearmanHealth = 10;
//        int spearmanFight = 10;

        int lowCountSpearman = 1;
        int maxCountSpearman = dragonHealth / spearmanFight;

        //поиск минимального кол-ва копейщиков
        while (lowCountSpearman < maxCountSpearman) {
            int mid = lowCountSpearman + (maxCountSpearman - lowCountSpearman) / 2;
            if (fight(dragonHealth, dragonFight, spearmanHealth, spearmanFight, mid)) {
                maxCountSpearman = mid;
            } else {
                lowCountSpearman = mid + 1;
            }
        }
        System.out.println("Минимальное кол-во копейщиков для уничтожения дракона равно: " + lowCountSpearman);
    }

    public static boolean fight(int dragonHealth, int dragonFight, int spearmanHealth, int spearmanFight, int countSpearman) {
        int sumSpearmanHealth = spearmanHealth * countSpearman;

        while (true) {
            dragonHealth -= spearmanFight * countSpearman;
            if (dragonHealth <= 0) {
                return true; //Дракон проиграл
            }
            sumSpearmanHealth -= dragonFight;
            if (sumSpearmanHealth <= 0) {
                return false; //Копейщики проиграли
            }
            countSpearman = sumSpearmanHealth / spearmanHealth;

        }
    }

    //Task6
    //Напишите рекурсивную функцию, проверяющую правильность расстановки скобок в строке введенной с клавиатуры. При правильной расстановке выполняются условия:
    //a.   количество открывающих и закрывающих скобок равно.
    //b.   внутри любой пары открывающая – соответствующая закрывающая скобка,
    //скобки расставлены правильно.
    //В строке могут присутствовать скобки как круглые, так и квадратные скобки (и др. символы). Каждой открывающей скобке соответствует закрывающая того же типа (круглой – круглая, квадратной- квадратная). Напишите рекурсивную функцию, проверяющую правильность расстановки скобок в строке.
    //Пример неправильной расстановки: ( [ ) ].
    //Пример правильных входных данных (a[b](f[(g)(g)]))
    //Программа должна вывести результат в виде строки, примеры
    //•  Правильная строка
    //•  Ошибка отсутствие (
    //•  Ошибка отсутствие [
    static int countSquareBracket;
    static int countRoundBracket;

    public static void task6() {

        String s = "(a[b](f[(g)(g)]))";

        isOk(s);
    }

    public static boolean isOk(String s) {
        countRoundBracket = 0;
        countSquareBracket = 0;

        //Первый символ не должен быть ) или ]
        String firstSymbol = s.substring(0, 1);
        if (firstSymbol.equals(")") || firstSymbol.equals("]")) {
            System.out.println("Ошибка. Строка не может начинаться с закрывающихся скобок");
            return false;
        }
        //проверяем посимвольно строку на правильную последовательность скобок
        for (int i = 0; i < s.length(); i++) {
            String symbol = s.substring(i, i + 1);
            switch (symbol) {
                case "(" -> countRoundBracket++;
                case ")" -> countRoundBracket--;
                case "[" -> countSquareBracket++;
                case "]" -> countSquareBracket--;
            }
        }


        if (countRoundBracket > 0) {
            System.out.println("Ошибка отсутствие )");
            return false;
        } else if (countRoundBracket < 0) {
            System.out.println("Ошибка отсутствие (");
            return false;
        } else if (countSquareBracket > 0) {
            System.out.println("Ошибка отсутствие ]");
            return false;
        } else if (countSquareBracket < 0) {
            System.out.println("Ошибка отсутствие [");
            return false;
        } else {
            System.out.println("Правильная строка");
            return true;
        }
    }


}