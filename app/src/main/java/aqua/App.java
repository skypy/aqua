package aqua;

import java.util.*;

import aqua.samples.*;
import aqua.mjr.*;
import static aqua.lib.Logger.*;

public class App {

  private void test()
    throws Exception
  {
    StreamExample example = new StreamExample();
    //example.test();

    SeleniumBasicExample selenium = new SeleniumBasicExample();
    selenium.run();
  }

  public static void main(String[] args)
    throws Exception
  {
    App app = new App();
    app.test();

    log("version => " + System.getProperty("java.version"));
  }
}
