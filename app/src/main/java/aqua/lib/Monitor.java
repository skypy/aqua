package aqua.lib;

import java.sql.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.util.logging.*;

public class Monitor {
  private static final long MEGABYTE = 1024L * 1024L;
  private long startTime;
  private long stopTime;
  private long memory;

  public Monitor() {
    this.startTime = System.currentTimeMillis();
  }

  public Monitor end() {
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();

    this.stopTime = System.currentTimeMillis();
    this.memory = runtime.totalMemory() - runtime.freeMemory();

    return this;
  }

  public void printInfo() {
    System.out.println("Used memory in bytes: " + memory);
    System.out.println("Used memory in megabytes: " + bytesToMegaBytes(memory));
    System.out.println("execution time in milis: " + (stopTime - startTime));
  }

  private static long bytesToMegaBytes(long bytes) { return bytes / MEGABYTE; }
}
