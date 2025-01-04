package aqua.richard;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import aqua.richard.command.editor.*;
import static aqua.lib.Logger.*;

public class DesignPrinciples {
  public void test()
    throws Exception
  {
    // command pattern example with editor
    TextEditor editor = new TextEditor();

    Macro m = new Macro();
    m.record(() -> editor.open()); // new Open(editor)
    m.record(() -> editor.save()); // new Save(editor)
    m.record(() -> editor.close()); // new Close(editor)
    m.run();
  }
}
