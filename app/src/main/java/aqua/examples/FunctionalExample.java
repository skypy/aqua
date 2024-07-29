package aqua.examples;

import java.util.*;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Function;

import static aqua.lib.Logger.*;

public class FunctionalExample {

  public void test()
    throws Exception
  {

  }

  public void test2()
    throws Exception
  {
    {
      List<String> list = new ArrayList<String>();
      list.add("foo");
      list.add("bar");
      list.add("kolkata");
      list.add("mumbai");
      list.add("finland");
      list.add("kerala");

      final long count = list.stream().filter(checkIfStartsWith("k")).count();
      log("count = " + count);
    }

    //final String val = "hello";
    //val.chars().forEach(System.out::println);

    //comparatorExample();
  }

  private void comparatorExample()
    throws Exception
  {
    List<Person> people = new ArrayList<>();
    people.add(new Person("foo", 20));
    people.add(new Person("bar", 60));
    people.add(new Person("foobar", 50));
    people.add(new Person("barfoo", 30));

    //log(people);
    // List<Person> result
    //   = (people
    //      .stream()
    //      .sorted((p1, p2) -> p1.ageDiff(p2))
    //      .collect(Collectors.toList()));

    // old way
    // iterate(people);
    // log("---");
    // Collections.sort(people, new Person.AgeComparator());
    // iterate(people);
    // log("--");
    // Collections.sort(people, new Person.NameComparator());
    // iterate(people);
  }

  private void iterate(List<Person> people)
    throws Exception
  {
    for (Person p : people) {
      log(p);
    }
  }

  public static Predicate<String> checkIfStartsWith(final String letter) {
    return name -> name.startsWith(letter);
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
