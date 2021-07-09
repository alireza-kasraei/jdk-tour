package net.devk.tutorials.generics;

import java.util.List;

public class ProducerExtendsConsumerSuper {

  public class A {
  }

  public class B extends A {
  }

  public class C extends B {
  }

  public void testCovariance(List<? extends B> list) {
    // list.add(new B());
    // list.add(new C());
    A a = list.get(0);
  }

  public void testContraVariance(List<? super B> list) {
    list.add(new B());
    list.add(new C());
    // A a= list.get(0);
  }

}
