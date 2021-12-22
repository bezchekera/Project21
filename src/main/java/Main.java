public class Main {

  public static void main(String[] args) {
    createFor(5);
    createWhile(10);
  }

  public static void createFor(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(i);
    }
  }

  public static void createWhile(int n) {
    int i = 0;
    while (i < n) {
      System.out.println(i);
      i++;
    }
  }
}
