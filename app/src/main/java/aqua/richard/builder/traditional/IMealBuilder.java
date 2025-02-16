package aqua.richard.builder.traditional;

public interface IMealBuilder {
  void buildMainCourse();
  void buildSideDish();
  void buildDrink();
  Meal getMeal();
}
