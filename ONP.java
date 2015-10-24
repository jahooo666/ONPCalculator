public class ONP {
    String text;
    String[] cutText;
    Stack stos = new Stack();

    public ONP(String text) {
        this.text = text;
    }

    public ONP(){

    }

    public void setText(String text) {
        this.text = text;
    }

    public void oblicz() {
        this.cutText = text.split(" ");
        for (int i = 0; i < cutText.length; i++) {
            String s = cutText[i];      //tablica z pociętym tekstem wejściowym
            try {
                double a, b;        //zmienne pomocnicze do dzielenia i odejmowania
                if (s.equals("x") || s.equals("*")) {   //mnożenie
                    stos.put(stos.pop().getValue() * stos.pop().getValue());
                } else if (s.equals(":") || s.equals("/")) {     //dzielenie
                    a = stos.pop().getValue();
                    b = stos.pop().getValue();
                    stos.put((double) (b / a));
                } else if (s.equals("+")) {             //dodawanie
                    stos.put(stos.pop().getValue() + stos.pop().getValue());
                } else if (s.equals("-")) {             //odejmowanie
                    a = stos.pop().getValue();
                    b = stos.pop().getValue();
                    stos.put(b - a);
                } else {
                    try {
                        stos.put(Double.parseDouble(s));
                    } catch (NumberFormatException ex) {    //błąd przy parsowaniu na doubla- jeśli napotkamy na nie-liczbę
                        System.out.println(text+ " = " +"Wpisano znak niedozwolony- dozwolone są tylko liczby i znaki operacji");
                        break;
                    }
                }
            } catch (EmptyStackException ex) {//błąd gdy stos liczb jest pusty
                System.out.println(text + " = " + "ZLA SKLADNIA ZA MAO LICZB ZA DUZO OPERACJI");
                break;
            }
            //System.out.println(this.stos.toString());
        }
        try {
            System.out.println(text + " = " + stos.pop().getValue());
        } catch (EmptyStackException ex) {

        }
    }

    public void oblicz(String s) {   //opcja wyliczania zadanego tekstu bez potrzeby tworzenia nowego kalkulatora.
        this.text = s;
        this.stos = new Stack();
        //this.cutText = null;
        oblicz();
    }

}

