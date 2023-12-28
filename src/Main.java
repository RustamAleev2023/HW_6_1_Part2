import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();

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

        System.out.println("SumSinuses = " + getSumSinuses(angles,1));
        System.out.println("SumCosines = " + getSumCosines(angles,1));
        System.out.println("SubtractSinuses = " + getSubtractSinuses(angles,1));
        System.out.println("SubtractCosines = " + getSubtractCosines(angles,1));
        System.out.println("MultiplySinuses = " + getMultiplySinuses(angles,1));
        System.out.println("MultiplyCosines = " + getMultiplyCosines(angles,1));


    }

    public static double getSumSinuses(double[] angles, int type) {
        double sumSinuses = 0;
        for (int i = 0; i < angles.length; i++) {
            if(type == 1){
                sumSinuses += Math.sin(Math.toRadians(angles[i]));
            } else if (type == 0){
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
            if(type == 1){
                sumCosines += Math.cos(Math.toRadians(angles[i]));
            } else if (type == 0){
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
            if(type == 1){
                subtractSinuses -= Math.sin(Math.toRadians(angles[i]));
            } else if (type == 0){
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
            if(type == 1){
                subtractCosines -= Math.cos(Math.toRadians(angles[i]));
            } else if (type == 0){
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
            if(type == 1){
                multiplySinuses *= Math.sin(Math.toRadians(angles[i]));
            } else if (type == 0){
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
            if(type == 1){
                multiplyCosines *= Math.cos(Math.toRadians(angles[i]));
            } else if (type == 0){
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
    public static void task2(){

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
        System.out.println("Итерационный алгоритм быстрее в " + (timeFactByRec/timeFactByIt) + " раз" );


    }
    public static long factorialByRecursion(int n){
        long result;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorialByRecursion(n - 1);
        }
        return result;
    }
    public static long factorialByIteration(int n){
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
    public static void task3(){
        int[] array = new int[]{1,3,2,5,4,7,6,9,8,10};
        print(array);
        sort(array);
        print(array);

    }
    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] < arr[i+1]){
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}