package aqua.richard;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;
import java.nio.file.*;

import aqua.richard.command.editor.*;
import aqua.richard.strategy.*;

import static aqua.lib.Logger.*;

public class DesignPrinciples {
  public void test()
    throws Exception
  {
    // testCommand();

    testStrategy();
  }

  private void testStrategy()
    throws Exception
  {
    Compressor compressor = new Compressor(new GzipStrategy());

    try {
      File out = new File("/tmp/result.gz");
      compressor.compress(Paths.get("/tmp/sample.txt"), out);
    } catch (IOException e) {
      throw e;
    }
  }

  private void testCommand()
    throws Exception
  {
    TextEditor editor = new TextEditor();

    Macro m = new Macro();
    m.record(() -> editor.open()); // new Open(editor)
    m.record(() -> editor.save()); // new Save(editor)
    m.record(() -> editor.close()); // new Close(editor)
    m.run();
  }
}
