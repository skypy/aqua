package aqua.mjr;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class StreamExample {

  private void testLazyOperation()
    throws Exception
  {
    OptionalInt result
      = (IntStream.range(10, 50)
         .map(n -> n * 2)
         .filter(n -> n % 2 == 0)
         .findFirst()
         );

    log("result = " + result.getAsInt());
  }

  public void test()
    throws Exception
  {
    log("[Chapter 3: Streams]");

    testLazyOperation();
  }
}
