package aqua.richard.strategy;

import java.io.*;
import java.lang.*;
import java.lang.Object.*;
import java.util.zip.ZipOutputStream;

public class ZipStrategy implements ICompressionStrategy {

  @Override
  public OutputStream compress(OutputStream stream)
    throws IOException
  {
    return new ZipOutputStream(stream);
  }
}
