package aqua.mjr;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class StreamExample {

  public void test()
    throws Exception
  {
    log("[Chapter 3: Streams]");

    testLazyOperation();
    testConcatStream();
    testFindFirst();
    testSummaryStatistics();
    testCountElementsInStream();
    testMisc();

    testPartition();
  }

  private void testMisc()
    throws Exception
  {
    Supplier<Stream<Integer>> supplier = () -> Stream.of(1, 2, 3, 4, 5, 6, 7);

    log("anyMatch = " + supplier.get().anyMatch(x -> x == 3));
    log("allMatch = " + supplier.get().allMatch(x -> x < 3));
    log("noneMatch = " + supplier.get().noneMatch(x -> 100 < x));
  }

  private void testPartition()
    throws Exception
  {
    Stream<Integer> data = Stream.of(1, 2, 3, 4, 5, 6, 7);
    Map<Boolean, List<Integer>> map = data.collect(Collectors.partitioningBy(x -> x < 3));
    log("partition example = " + map);
  }

  private void testCountElementsInStream()
    throws Exception
  {
    long result = Stream.of(1, 2, 3, 4, 5, 6, 7).count();
    log("testCountElementsInStream: result = " + result);

    long result2 = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(Collectors.counting());
    log("testCountElementsInStream: downstream collector => result2 = " + result2);
  }

  private void testSummaryStatistics()
    throws Exception
  {
    IntSummaryStatistics result = IntStream.range(1, 10).summaryStatistics();
    log("testSummaryStatistics: result = " + result.toString());
  }

  private void testFindFirst()
    throws Exception
  {
    Optional<Integer> result = Stream.of(11, 15, 17, 25, 30, 31, 33).filter(x -> x % 2 == 0).findFirst();
    log("testFindFirst: result = " + result);
  }

  private void testConcatStream()
    throws Exception
  {
    Stream<String> first = Stream.of("a", "b", "c");
    Stream<String> second = Stream.of("x", "y", "z");

    List<String> result = Stream.concat(first, second).collect(Collectors.toList());
    log("testConcatStream: result = " + result);
  }

  private void testLazyOperation()
    throws Exception
  {
    OptionalInt result
      = (IntStream.range(10, 50)
         .map(n -> n * 2)
         .filter(n -> n % 2 == 0)
         .findFirst()
         );

    log("testLazyOperation: result = " + result.getAsInt());
  }
}
