public class PairString {  //pojedynczy element stosu- podstawowa klasa z geterami i seterami
    String value;
    PairString next;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PairString getNext() {
        return next;
    }

    public void setNext(PairString next) {
        this.next = next;
    }

    public PairString(String value, PairString next) {
        this.value = value;
        this.next = next;

    }
}
