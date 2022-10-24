package lesson1;

public class MainForLessonOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange2");
        System.out.println("Banana2");
        System.out.println("Apple2\n");
    }
    private static void checkSumSign() {
        int a = 2;
        int b = -7;
        int i = a+b;
        if ( i>=0 ) {
            System.out.println("Сумма положительная\n");
        }
        else {
            System.out.println("Сумма отрицательная\n");
        }
    }
    private static void printColor() {
        int value;
        value = 1000;
        if (value <= 0) {
            System.out.println("Красный\n");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый\n");
        }
        if (value > 100) {
            System.out.println("Зеленый\n");
        }
    }
    private static void compareNumbers() {
        int a = 125;
        int b = 13;
        if (a>=b){
            System.out.println("a >= b\n");
        }
        if (a<b){
            System.out.println("a < b\n");
        }
    }
}
