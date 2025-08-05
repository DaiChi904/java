package examination.end_term;

interface Decorator {
    String decorate(String str);
}

class StarDecorator implements Decorator {
    private final int num;

    StarDecorator(int num) {
        this.num = num;
    }

    @Override
    public String decorate(String str) {
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < num; i++) {
            builder.append(" * ");
        }
        return builder.toString();
    }
}

class SandwichDecorator implements Decorator {
    private final String symbol;

    SandwichDecorator(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String decorate(String str) {
        return symbol + str + symbol;
    }
}

class Display {
    private Decorator decorator;

    void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    void output(String str) {
        if (decorator != null) {
            System.out.println(decorator.decorate(str));
        }
    }
}

public class StringDecoration {
    public static void main(String[] args) {
        Display display = new Display();
        display.setDecorator(new StarDecorator(3));
        display.output("star");

        display.setDecorator(new SandwichDecorator(" !! "));
        display.output("sandwich");
    }
}