package aqua.richard.strategy;

import java.io.*;

public interface ICompressionStrategy {
  public OutputStream compress(OutputStream data) throws IOException;
}
