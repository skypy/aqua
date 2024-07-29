package aqua.utility;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class Processor {
  private final Object lock;
  private int token = 0;

  public Processor(Object lock) {
    this.lock = lock;
  }

  public void process() {
    synchronized (lock)  {
      log("Thread : " + Thread.currentThread().getName() + " is [entering] crtitical section");

      try {
        ++token;
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }

      log("Thread : " + Thread.currentThread().getName() + " is [leaving]");
    }
  }

  public int getToken() {
    synchronized (lock) {
      return token;
    }
  }
}
