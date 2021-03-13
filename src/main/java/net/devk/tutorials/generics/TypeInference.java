package net.devk.tutorials.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

  public static final <T> List<T> emptyList() {
    return new ArrayList<>();
  }


  public static void main(String[] args) {
    // type inference
    List<String> emptyList = emptyList();
    // explicit type inference
    List<String> exEmptyList = TypeInference.<String>emptyList();
  }


}
