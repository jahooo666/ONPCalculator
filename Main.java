public class Main {
    public static void main(String[] args) {

        ONP calc = new ONP("2 7 + 3 / 14 3 - 4 * + 2 /");
        System.out.println(calc.evaluate());

        /*Stack stos = new Stack();
        for (int i = 0; i < 20; ++i) {
            stos.put(i);
        }
        try {
           while(true){                          //powtarzamy do momentu wyrzucenia wyjątku
                System.out.println(stos.pop().getValue());
            }
        }catch(EmptyStackException ex){         //przyjmujemy tylko konkretny wyjątek końca stosu
            System.out.println(ex.getMessage());
        }
*/
    }
}