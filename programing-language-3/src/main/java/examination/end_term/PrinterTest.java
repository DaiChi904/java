package examination.end_term;

import java.io.PrintStream;

public class PrinterTest {
    public static void main(String[] args) {
        PrintStream stream = System.err;
        Printer printer = new Printer(10, 10);

        try {
            printer.print(8);
        } catch (OutOfResourceException ex) {
            stream.println(ex.getMessage());
            System.exit(1);
        }
    }
}

class Printer {
    private int ink;
    private int paper;

    Printer(int ink, int paper) {
        this.ink = ink;
        this.paper = paper;
    }

    void print(int num) throws OutOfResourceException {
        for (int i = 0; i < num; i++) {
            if (ink <= 0) {
                throw new OutOfResourceException("Out of Ink");
            } else if (paper <= 0) {
                throw new OutOfResourceException("Out of Paper");
            }
            ink = ink - 2;
            paper--;
        }
    }
}

class OutOfResourceException extends Exception {
    public OutOfResourceException(String message) {
        super(message);
    }
}