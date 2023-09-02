package aqua;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

//import aqua.samples.*;
import aqua.mjr.*;
import aqua.effectiveJava.*;
import aqua.wellGroundedJava.threading.*;

import static aqua.lib.Logger.*;

public class App {

  public String foo() { return "foo"; }

  private void test()
    throws Exception
  {
    modernReceipes();

    // TODO: well grounded java examples - first is concurrency
    ThreadingExamples te = new ThreadingExamples();
    //log("te: " + te.test());

    EffectiveJavaExamples eje = new EffectiveJavaExamples();
    //eje.test();
  }

  private void modernReceipes()
    throws Exception
  {
    ComparatorsExamples ce = new ComparatorsExamples();
    ce.test();

    StreamExample example = new StreamExample();
    //example.test();

    JEightLambdas jeight = new JEightLambdas();
    //jeight.test();
  }

  public static void main(String[] args)
    throws Exception
  {
    log("version => " + System.getProperty("java.version"));

    Row row = new Row();
    log("row = " + row.getName());

    App app = new App();
    app.test();

    log("impressions = " + Long.valueOf(1));
  }

  // -----------------------------------------------------

  private static class Row {
    private String name;
    private int clicks;

    public int getClicks() { return clicks; }

    public String getName() { return null == name ? "Magic" : name; }
  }
}
