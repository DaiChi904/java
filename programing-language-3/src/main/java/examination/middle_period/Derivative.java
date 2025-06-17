package examination.middle_period;

class Original {
  private String name;

  Original(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Derivative extends Original {
  Derivative(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName().toUpperCase();
  }

  public static void main(String[] args) {
    Original ref1 = new Derivative(" hoge ");
    Derivative ref2 = new Derivative(" hoge ");
    Original ref3 = ref2;

    System.out.println(ref3.getName());

    if (ref1 == ref2) {
      System.out.println(" ref1 == ref2 ");
    }

    if (ref2 instanceof Original) {
      System.out.println(" ref2 is an instance of Original . ");
    }
    if (ref3 instanceof Derivative) {
      System.out.println(" ref3 is an instance of Derivative . ");
    }
  }
}
