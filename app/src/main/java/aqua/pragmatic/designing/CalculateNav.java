package aqua.pragmatic.designing;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;
import java.math.BigDecimal;

import static aqua.lib.Logger.*;

public class CalculateNav {
  private Function<String, BigDecimal> priceFinder;

  public CalculateNav(Function<String, BigDecimal> priceFinder)
    throws Exception
  {
    this.priceFinder = priceFinder;
  }

  public BigDecimal computeStockPrice(String ticker,
                                      int shares)
    throws Exception
  {
    return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
  }
}
