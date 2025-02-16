package aqua.richard;

import java.util.*;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;
import java.nio.file.*;

import aqua.richard.command.editor.*;
import aqua.richard.strategy.*;
import aqua.richard.observer.traditional.*;
import aqua.richard.observer.functional.*;
import aqua.richard.template.traditional.*;
import aqua.richard.template.functional.*;
import aqua.richard.factory.traditional.*;
import aqua.richard.builder.traditional.*;

import static aqua.lib.Logger.*;

public class DesignPrinciples {
  public void test()
    throws Exception
  {
    // testCommand();
    // testStrategy();
    // testObserverPatter();

    //testTemplatePattern();
    //testFactoryPattern();

    testBuilderPattern();
  }

  private void testBuilderPattern()
    throws Exception
  {
    IMealBuilder veg = new VegMealBuilder();
    Restaurant restaurant = new Restaurant(veg);

    log("veg meal = " + restaurant.construct());
  }

  private void testFactoryPattern()
    throws Exception
  {
    ShapeFactory factory = new ShapeFactory();

    IShape circle = factory.getShape("circle");
    circle.draw();

    IShape rectangle = factory.getShape("rectangle");
    rectangle.draw();
  }

  private void testTemplatePattern()
    throws Exception
  {
    AGame photo = new PhotoGame();
    AGame video = new VideoGame();

    photo.play();
    video.play();

    log("#-----------#");

    SportsManager sm = new SportsManager();
    sm.manage();
  }

  private void testObserverPatter()
    throws Exception
  {
    // functional
    ScoreManager manager = new ScoreManager();

    manager.addObserver(x -> log("android score updater = " + x));
    manager.addObserver(x -> log("iphone score updater = " + x));

    manager.setScore(100);
    manager.setScore(150);

    log("#-----------#");

    // traditional
    WeatherStation ws = new WeatherStation();

    ws.addObserver(new PhoneDisplay());
    ws.addObserver(new TVDisplay());

    ws.setTemperature(25);
    ws.setTemperature(30);
  }

  private void testStrategy()
    throws Exception
  {
    Compressor compressor = new Compressor(new GzipStrategy());

    try {
      File out = new File("/tmp/result.gz");
      compressor.compress(Paths.get("/tmp/sample.txt"), out);
    } catch (IOException e) {
      throw e;
    }
  }

  private void testCommand()
    throws Exception
  {
    TextEditor editor = new TextEditor();

    Macro m = new Macro();
    m.record(() -> editor.open()); // new Open(editor)
    m.record(() -> editor.save()); // new Save(editor)
    m.record(() -> editor.close()); // new Close(editor)
    m.run();
  }
}
