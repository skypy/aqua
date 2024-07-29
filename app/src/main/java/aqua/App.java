package aqua;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

//import aqua.samples.*;
import aqua.mjr.*;
import aqua.effectiveJava.*;
import aqua.wellGroundedJava.threading.*;
import aqua.examples.*;
import aqua.pragmatic.compare.*;
import aqua.pragmatic.designing.*;

import static aqua.lib.Logger.*;

public class App {

  public String foo() { return "foo"; }

  private void test()
    throws Exception
  {
    {
      PlayGround pg = new PlayGround();
      //pg.test();
    }

    {
      AssetHelper helper = new AssetHelper();
      //helper.test();
      log("version = " + System.getProperty("java.version"));
    }

    {
      Compare c = new Compare();
      //c.test();
    }

    {
      //EffectiveJavaExamples eje = new EffectiveJavaExamples();
      //eje.test();
    }

    {
      functionExamples();
    }

    {
      //modernReceipes();
    }

    {
      // TODO: well grounded java examples - first is concurrency
      //ThreadingExamples te = new ThreadingExamples();
      //log("te: " + te.test());
    }
  }

  private void functionExamples()
    throws Exception
  {
    FunctionalExample fe = new FunctionalExample();
    fe.test();
  }

  private void modernReceipes()
    throws Exception
  {
    LearnFunctions fn = new LearnFunctions();
    fn.test();

    ComparatorsExamples ce = new ComparatorsExamples();
    //ce.test();

    StreamExample example = new StreamExample();
    //example.test();

    JEightLambdas jeight = new JEightLambdas();
    //jeight.test();
  }

  public static void main(String[] args)
    throws Exception
  {
    App app = new App();
    app.test();

  }

}
