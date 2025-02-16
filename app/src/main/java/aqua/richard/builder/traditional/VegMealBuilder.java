package aqua.richard.builder.traditional;

public class VegMealBuilder implements IMealBuilder {
  private Meal meal = new Meal();

  @Override
  public void buildMainCourse() {
    meal.setMainCourse("Veg Burger");
  }

  @Override
  public void buildSideDish() {
    meal.setSideDish("Fries");
  }

  @Override
  public void buildDrink() {
    meal.setDrink("Orange Juice");
  }

  @Override
  public Meal getMeal() {
    return meal;
  }
}
