package aqua.richard.factory.traditional;

import static aqua.lib.Logger.*;

public class ShapeFactory {
  public IShape getShape(String type) {
    if (null == type) return null;

    if ("circle".equals(type)) {
      return new Circle();
    } else if ("rectangle".equals(type)) {
      return new Rectangle();
    }

    return null;
  }
}
