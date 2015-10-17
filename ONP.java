public class ONP {
    String text;
    String[] cutText;
    Stack stos = new Stack();

    public ONP(String text) {
        this.text = text;
        this.cutText = text.split(" ");
    }

    public double evaluate() {
        for (int i = 0; i < cutText.length; i++) {
            String s = cutText[i];
            try {
                double d;
               // System.out.println(s);
                if (s.equals("x")||s.equals("*")) {
                   stos.put(stos.pop().getValue()* stos.pop().getValue());
                }else if(s.equals(":")||s.equals("/")) {
                    double a= stos.pop().getValue();
                    double b= stos.pop().getValue();
                    stos.put((double)(b/a));
                }else if (s.equals("+")) {
                    stos.put(stos.pop().getValue() + stos.pop().getValue());
                }else if (s.equals("-")) {
                    double a= stos.pop().getValue();
                    double b= stos.pop().getValue();
                    stos.put(b-a);
                }else {
                   stos.put(Double.parseDouble(s));
                }
            } catch (EmptyStackException ex) {
                System.out.println("znak. a nie ma liczb");
            }
           // System.out.println(this.stos.toString());
        }
        try {
            return stos.pop().getValue();
        }catch (EmptyStackException ex){
            System.out.println("nie ma wyniku");
        }
        return -1;
    }


}

