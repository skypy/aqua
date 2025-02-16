package aqua.richard.factory.traditional;

import static aqua.lib.Logger.*;

public class Rectangle implements IShape {
  @Override
  public void draw() {
    log("draw a rectangle");
  }
}
