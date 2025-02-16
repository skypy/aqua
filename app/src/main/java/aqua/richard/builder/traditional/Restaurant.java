package aqua.richard.builder.traditional;

public class Restaurant {
  private IMealBuilder builder;

  public Restaurant(IMealBuilder builder) {
    this.builder = builder;
  }

  public Meal construct() {
    builder.buildMainCourse();
    builder.buildSideDish();
    builder.buildDrink();
    return builder.getMeal();
  }
}
