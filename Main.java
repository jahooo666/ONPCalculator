public class Main {
    public static void main(String[] args) {

        ONP calc = new ONP();
        calc.oblicz("2 7 + 3 / 14 3 - 4 * + 2 /");
        System.out.println("----------------------");
        calc.oblicz("6 14 * 56 + 23 4 * 78 : - 97 /");
        System.out.println("----------------------");
        calc.oblicz("6 * 56 + 23 4 * 78 : - 97 /");  //przykład celowo błędny- na potrzeby testów
        System.out.println("----------------------");
        calc.oblicz("7 13 + 25 - 23 4 / 5 * + 13 /");
        System.out.println("----------------------");
        calc.oblicz("7 13 25 23 4 18 13");  //inny przykad niepoprawnej składni - tutaj błąd nie jest komunikowany, a podawany jest ostatni element stosu i jest to zachowanie prawiodłowe
        System.out.println("----------------------");
        calc.oblicz("!@$%!@##$%@$$^##@$FSDERV#F$G%~~~~"); //niepoprawna składnia- użyto niedozwolonych znaków
    }
}