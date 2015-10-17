public class Pair{  //pojedynczy element stosu- podstawowa klasa z geterami i seterami
    double value;
    Pair next;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Pair getNext() {
        return next;
    }

    public void setNext(Pair next) {
        this.next = next;
    }

    public Pair(double value, Pair next) {
        this.value = value;
        this.next = next;

    }
}
