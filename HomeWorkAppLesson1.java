package Gblesson1;

public class HomeWorkAppLesson1 {

    public static void main ( String[] args ) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }

    private static void printThreeWords () {
        String a = "Orange";
        String b = "Banana";
        String c = "Apple";
        System.out.println ( a );
        System.out.println ( b );
        System.out.println ( c );
    }

    private static void checkSumSign () {
        int a = 4;
        int b = -9;
        int c = a + b;
        //  System.out.println (c) суммы a + b
        if (c <= 0) {
            System.out.println ( "Сумма отрицательная" );
        }
        if (c >= 0) {
            System.out.println ( "Сумма положительная" );
        }


    }

    private static void printColor () {
        int value = 147;
        if (value <= 0) {
            System.out.println ( "Red" );
        } else if (value > 0 && value <= 100) {
            System.out.println ( "Yellow" );
        } else {
            System.out.println ( "Green" );
        }
    }

    private static void compareNumbers () {
        int a = 5;
        int b = 77;
        if (a >= b) {
            System.out.println ( "a >= b" );
        } else {
            System.out.println ( "a < b" );
        }
    }


}

