package lectures.lecture1;

public class Sum {
  public static void main(String[] args) {
    if (args.length <= 0) {
      return;
    }

    int n = Integer.parseInt(args[0]);
    System.out.println("1 + ... + " + n + " = " + sum(n));
  }

  static int sum(int n) {
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      ans = ans + i;
    }
    return ans;
  }
}
