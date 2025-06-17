package examination.middle_period;

class Limited {
  private static int remain = 10;
  int real;
  int img;

  Limited(int real, int img) {
    this.real = real;
    this.img = img;
    remain--;
  }

  void add(int n) {
    real = real + n;
  }

  void add(Limited arg) {
    real = real + arg.real;
    img = img + arg.img;
  }

  static Limited plus(Limited arg1, Limited arg2) {
    int r = arg1.real + arg2.real;
    int i = arg1.img + arg2.img;
    return new Limited(r, i);
  }

  static int getRemain() {
    return remain;
  }
}

public class Main {
  public static void main(String[] args) {
    Limited obj1 = new Limited(3, 2);
    Limited obj2 = new Limited(-5, 7);
    Limited obj3 = Limited.plus(obj1, obj2);

    obj2.add(obj1);
    obj3 = Limited.plus(obj2, obj3);

    System.out.println(Limited.getRemain());
  }
}
