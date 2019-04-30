package example.projecta;

import example.projectb.FooBar;

public class Main {

  public static void main(String... args) throws InterruptedException {
    System.out.println(new FooBar().getFooBar());
  }
}
