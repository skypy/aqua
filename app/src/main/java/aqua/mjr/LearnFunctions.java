package aqua.mjr;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class LearnFunctions {

  public void test()
    throws Exception
  {
    //consumer();
    supplier();
  }

  private void supplier()
    throws Exception
  {
    Supplier<Double> val = () -> Math.random();
    log("val = " + val.get());
  }

  private void consumer()
    throws Exception
  {
    Consumer<String> printResult = (x) -> log(x);
    printResult.accept("functions..");

    List<String> vals = Arrays.asList("one", "two", "three", "four");
    vals.forEach(new Consumer<String>() {
        @Override
        public void accept(String x) {
          log(x);
        }
      });
  }
}
