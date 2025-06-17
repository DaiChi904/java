package lectures.lecture2;

public class Zero {
  public static void main(String[] args) {
    d_zero();
    i_zero();
  }

  static void d_zero() {
    double a = 0;
    double b = -0;
    double c = -a;
    double d = 0 - a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }

  static void i_zero() {
    int a = 0;
    int b = -0;
    int c = -a;
    int d = 0 - a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
