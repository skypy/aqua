package aqua.effectiveJava;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class EffectiveJavaExamples {
  public void test()
    throws Exception
  {
    log("effective java examples...");
    Row row = new Row();

    row
      .setFlag(false)
      .setCount(10);

    new Processor(row);

    log("row = " + row.toString());
  }

  // -----------------------------

  private static class Processor {
    private Row row;

    public Processor(Row row) {
      this.row = row;

      row
        .setFlag(false)
        .setCount(2);
    }
  }

  // -----------------------------

  private static class Row {
    private boolean flag;
    private int count;

    public Row setFlag(boolean val) { flag = val; return this; }
    public Row setCount(int val) { count = val; return this; }

    public boolean getFlag() { return flag; }

    public String toString() {
      return String.format("flag : [%s], count : [%s]", flag, count);
    }
  }
}
