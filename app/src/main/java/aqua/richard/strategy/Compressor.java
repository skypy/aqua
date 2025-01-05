package aqua.richard.strategy;

import java.io.*;
import java.lang.*;
import java.lang.Object.*;
import java.nio.file.*;

public class Compressor {
  private final ICompressionStrategy strategy;

  public Compressor(ICompressionStrategy strategy) {
    this.strategy = strategy;
  }

  public void compress(Path input, File output)
    throws IOException
  {
    try (OutputStream out = new FileOutputStream(output)) {
      Files.copy(input, strategy.compress(out));
    }
  }
}
