package aqua.pragmatic.designing;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class Asset {
  public enum AssetType { BOND, STOCK };

  private final AssetType type;
  private final int value;

  public Asset(final AssetType assetType, final int assetValue) {
    type = assetType;
    value = assetValue;
  }

  public AssetType getType() { return type; }

  public int getValue() { return value; }
}
