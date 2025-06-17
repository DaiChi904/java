package examination.rehearsal;

public class Yokou {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        Abst ref = new CncrtInt(" test ", 10);
        ref.display();
    }
}

abstract class Abst {
    private String name;

    Abst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

class CncrtInt extends Abst {
    private int value ;

    CncrtInt ( String name , int value ) {
        super ( name );
        this . value = value ;
    }
}

