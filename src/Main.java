public class Main {
    public static void main(String[] args) {


    }

    public static void printSymbol(int size, char symbol) {

        for (int i = 0; i <= size; i++) {

            for (int j = size; j > i; j--) {

                System.out.printf(" ");

            }
            for (int k = 0; k < i + 1; k++) {

                System.out.printf(" ");

                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}