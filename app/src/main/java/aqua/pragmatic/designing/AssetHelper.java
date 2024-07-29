package aqua.pragmatic.designing;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class AssetHelper {
  List<Asset> assets;

  public void createAssests()
    throws Exception
  {
    this.assets
      = Arrays.asList(new Asset(Asset.AssetType.BOND, 10),
                      new Asset(Asset.AssetType.BOND, 20),
                      new Asset(Asset.AssetType.STOCK, 30),
                      new Asset(Asset.AssetType.STOCK, 40));
  }

  public int totalAssetValues(final List<Asset> assets,
                              final Predicate<Asset> predicate)
    throws Exception
  {
    return (assets
            .stream()
            .filter(predicate)
            .mapToInt(Asset::getValue)
            .sum());
  }

  public void test()
    throws Exception
  {
    createAssests();
    log("total = " + totalAssetValues(assets, x -> true));
    log("total = " + totalAssetValues(assets, x -> x.getType() == Asset.AssetType.BOND));
  }
}
