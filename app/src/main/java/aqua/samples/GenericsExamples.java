package aqua.samples;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import aqua.pragmatic.compare.*;
import aqua.pragmatic.designing.*;
import aqua.richard.*;
import aqua.utility.*;

import static aqua.lib.Logger.*;

public class  GenericsExamples {
  public void test () {
    Box<String> chocolates = new Box<>();
    chocolates.set("dairy milk");

    log("chocolates box = " + chocolates.get());

    Integer[] boxNum = {1, 2, 3, 4};
    chocolates.printValues(boxNum);

    log("square = " + chocolates.square(10));


    Box<Integer> prices = new Box<>();
    prices.set(100);
    String[] priceTags = {"a", "b", "c", "d"};

    log("price box = " + prices.get());
    prices.printValues(priceTags);

    prices.printList(List.of(10, 20, 30));

  }

  // ------------------------------

  private class Box<T> {
    private T value;

    public void set(T value) {
      this.value = value;
    }

    public T get() { return value; }

    public <T extends Number> double square(T number) {
      return number.doubleValue() * number.doubleValue();
    }

    public <T> void printValues(T[] values) {
      for (T item : values) {
        log("item = " + item);
      }
    }

    public void printList(List<?> values) {
      for (Object item : values) {
        log("list item = " + item);
      }
    }
  }
}
