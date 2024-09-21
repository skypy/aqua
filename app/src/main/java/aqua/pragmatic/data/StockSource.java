package aqua.pragmatic.data;

import java.math.BigDecimal;
import java.net.*;
import java.util.Scanner;

public class StockSource {
  final private static String SOURCE_EODHD = "https://eodhistoricaldata.com/api/eod/%s.US?%s&%s&%s";

  public static BigDecimal getPrice(String ticker)
    throws Exception
  {
    try {
      URL url = new URI(String.format(SOURCE_EODHD,
                                      ticker,
                                      "fmt=json",
                                      "filter=last_close",
                                      "api_token=OeAFFmMliFG5orCUuwAKQ8l4WWFQ67YX")).toURL();

      try (Scanner sc = new Scanner(url.openStream())) {
        return new BigDecimal(sc.nextLine());
      }
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}
