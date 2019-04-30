package example.projectb;

import example.projectc.Bar;

public class FooBar {

  public String getFooBar() {
    Foo foo = new Foo();
    Bar bar = new Bar();

    return foo.getFoo() + bar.getBar();
  }
}
