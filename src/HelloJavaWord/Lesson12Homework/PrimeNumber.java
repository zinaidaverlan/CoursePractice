package HelloJavaWord.Lesson12Homework;

public class PrimeNumber {
    private int number;

    public PrimeNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static boolean testPrimeNum(int nr) {
        int n = 0;// numara divizorii proprii
        // variabila d reprezinta divizorii nr
        for (int d = 2; d <= nr / 2; d++) {
            if (nr % d == 0) n++;
        }
        if (n == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        PrimeNumber number1= new PrimeNumber(5);
        if (testPrimeNum(5) )System.out.println("numarul "+number1+" este prim");
        //apelam metoda pentru un sir de numere 1 la 1000
        for (int i = 1, j = 1; i <= 1000; i++) {
            if (testPrimeNum(i)) {
                if (j % 30 != 0) {
                    // variabila j se utilizeaza pentru afisarea cite 30 de numere prime pe linie

                    System.out.print(i + " ");
                } else {
                    System.out.println(i + " ");
                }
                j++;
            }
        }

    }
}

