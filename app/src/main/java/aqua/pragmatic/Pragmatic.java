package aqua.pragmatic;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;
import java.math.BigDecimal;

import aqua.pragmatic.compare.*;
import aqua.pragmatic.designing.*;
import aqua.pragmatic.data.StockSource;

import static aqua.lib.Logger.*;

public class Pragmatic {

  public void test()
    throws Exception
  {
    Designing design = new Designing();

    design.test();
  }

  // ------------------------------------------

  private static class Designing {
    public void test()
      throws Exception
    {
      // separating concerns using lambda
      //AssetHelper helper = new AssetHelper();
      //helper.test();

      // delegating using lambda

      // XX error => incompatible thrown types Exception in functional expression
      // CalculateNav calc = new CalculateNav(StockSource::getPrice);

      Function<String, BigDecimal> priceFinder
        = ticker -> {
        try {
          return StockSource.getPrice(ticker);
        } catch (Exception e) {
          e.printStackTrace();
          return BigDecimal.ZERO;
        }
      };

      CalculateNav calc = new CalculateNav(priceFinder);
      BigDecimal price = calc.computeStockPrice("AAPL", 100);
      log("100 Apple stock price = " + price);
    }
  }
}
