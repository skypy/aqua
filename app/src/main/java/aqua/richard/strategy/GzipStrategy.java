package aqua.richard.strategy;

import java.io.*;
import java.lang.*;
import java.lang.Object.*;
import java.util.zip.GZIPOutputStream;

public class GzipStrategy implements ICompressionStrategy {

  @Override
  public OutputStream compress(OutputStream stream)
    throws IOException
  {
    return new GZIPOutputStream(stream);
  }
}
