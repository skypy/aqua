package aqua.utility;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

public class Worker implements Runnable {
  private final Processor processor;

  public Worker(Processor processor) {
    this.processor = processor;
  }

  @Override
  public void run() {
    processor.process();
  }
}
