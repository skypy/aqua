package aqua.pragmatic.compare;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class Compare {
  public void test()
    throws Exception
  {

  }

  // -----------------------------------------------

  public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public String toString() {
      return String.format("{ %s : %d }", name, age);
    }

    public int ageDiff(final Person other) {
      return age - other.age;
    }

    public void printPeople(final List<Person> people) {
      people.forEach(System.out::println);
    }

    public static class NameComparator implements Comparator<Person> {
      @Override
      public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
      }
    }

    public static class AgeComparator implements Comparator<Person> {
      @Override
      public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
      }
    }
  }
}
