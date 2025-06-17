package examination.middle_period;

abstract class Form {
  private int value;

  Form(int value) {
    this.value = (value > 0) ? 1 : 0;
  }

  int evaluate() {
    return value;
  }

  abstract String display();
}

class Atom extends Form {
  Atom(int value) {
    super(value);
  }

  @Override
  String display() {
    return (evaluate() > 0) ? " T " : " F ";
  }
}

class OrForm extends Form {
  Form left;
  Form right;

  OrForm(Form left, Form right) {
    super(Math.max(left.evaluate(), right.evaluate()));
    this.left = left;
    this.right = right;
  }

  @Override
  String display() {
    return " OR ( " + left.display() + " ," + right.display() + " ) ";
  }
}

public class PropForm {
  public static void main(String[] args) {
    Form form = new OrForm(new OrForm(new Atom(0), new Atom(1)),
        new OrForm(new Atom(3), new Atom(0)));
    System.out.println(form.display() + " : " + form.evaluate());
  }
}
