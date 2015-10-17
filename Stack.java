import java.util.ArrayList;

public class Stack {
    Pair head;

    public Stack() {
    }   //konstruktor do tworzenia pustego stosu

    public Stack(double value) {    //konstruktor do tworzenia stosu z jednym elementem
        head = new Pair(value, null);
    }

    public void put(double value) {     //metoda do dodawania elementu do stosu
        head = new Pair(value, head);
    }

    public Pair pop() throws EmptyStackException {   //metoda do zdejmowania jednego elementu ze stosu
        if (this.isEmpty())  //jeżeli stos jest pusty rzucamy konkretnym wyjątkiem
            throw new EmptyStackException("napotkano koniec stosu");
        else {
            Pair tempHead = this.head;  //przechowujemy tymczasowo starą głowę
            this.head = this.head.getNext();    //drugi element staje się głową
            return tempHead;            //zwracamy starą głowę
        }
    }

    public String toString() {
        ArrayList<Double> t = new ArrayList<Double>();
        StringBuilder s = new StringBuilder();
        try {
            while (true) {
                t.add(this.pop().getValue());
            }
        } catch (EmptyStackException e) {
            for (int i = t.size()-1; i >=0 ; i--) {
                s.append(t.get(i));
                s.append("~");
                this.put(t.get(i));
            }
            s.append("#");
        }
        return s.toString();
    }

    public boolean isEmpty() {
        if (this.head == null)      //sprawdzamy czy głowa istnieje
            return true;
        else
            return false;
    }


}