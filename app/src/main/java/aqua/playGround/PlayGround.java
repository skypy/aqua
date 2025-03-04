package aqua.playGround;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import aqua.pragmatic.compare.*;
import aqua.pragmatic.designing.*;
import aqua.richard.*;
import aqua.utility.*;
import aqua.samples.*;

import static aqua.lib.Logger.*;

public class PlayGround {

  public void test()
    throws Exception
  {
    //threadExample();

    // use of Record (getter / setter)
    //Stat stat = new Stat(100, 50.3f);
    //log("clicks = " + stat.clicks() + " : cost = " + stat.cost());

    DesignPrinciples dp = new DesignPrinciples();
    //dp.test();

    GenericsExamples ge = new GenericsExamples();
    ge.test();
  }

  private void threadExample()
    throws Exception
  {
    Object lock = new Object();
    Processor processor = new Processor(lock);

    Thread t1 = new Thread(new Worker(processor), "Thread-1");
    Thread t2 = new Thread(new Worker(processor), "Thread-2");

    t1.start();
    t2.start();
  }

  public record Stat(int clicks, float cost) { }
}
