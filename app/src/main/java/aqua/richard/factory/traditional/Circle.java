package aqua.richard.factory.traditional;

import static aqua.lib.Logger.*;

public class Circle implements IShape {
  @Override
  public void draw() {
    log("draw a circle");
  }
}
