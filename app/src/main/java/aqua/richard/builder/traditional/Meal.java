package aqua.richard.builder.traditional;

public class Meal {
  private String mainCourse;
  private String sideDish;
  private String drink;

  public void setMainCourse(String mainCourse) {
    this.mainCourse = mainCourse;
  }

  public void setSideDish(String sideDish) {
    this.sideDish = sideDish;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  @Override
  public String toString() {
    return "Meal [Main Course: " + mainCourse + ", Side Dish: " + sideDish + ", Drink: " + drink + "]";
  }
}
