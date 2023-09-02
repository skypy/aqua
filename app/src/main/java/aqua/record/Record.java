package aqua.rcord;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

public class Record {
  private int id;
  private String name;

  Record () {}

  public Record setId(int val) { this.id = val; return this; }
  public Record setName(String val) { this.name = val; return this; }

  public int getId() { return id; }
  public String getName() { return name; }
}
