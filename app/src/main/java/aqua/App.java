package aqua;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

//import aqua.samples.*;
import aqua.mjr.*;
import static aqua.lib.Logger.*;

public class App {

  public String foo() { return "foo"; }

  private void test()
    throws Exception
  {
    log("<----entry point---->");
    StreamExample example = new StreamExample();
    example.test();

    //SeleniumBasicExample selenium = new SeleniumBasicExample();
    //selenium.run();

    JEightLambdas jeight = new JEightLambdas();
    //jeight.test();
  }

  public static void main(String[] args)
    throws Exception
  {
    App app = new App();
    app.test();

    log("version => " + System.getProperty("java.version"));
  }

  // -----------------------------------------------------
}
