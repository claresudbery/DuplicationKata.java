package org.learnwithllew.duplicationkata;

import java.util.function.Function;

public class Lesson31 extends Song
{
  public void singSong(int style, String... names)
  {
    switch (style)
    {
      case 1 :
        for (String name : names)
        {
          boolean checkName = true;
          Function<String, Boolean> nameCheck = name1 -> name1.startsWith("L");
          if (checkName && nameCheck.apply(name))
          {
            Function<String, String> specialGreetingFunc = name1 -> "Hip Hip Hurray! For " + name1;
            sing(specialGreetingFunc.apply(name));
          }
          else
          {
            sing("Hello " + name + ", it's nice to meet you.");
          }
        }
        break;
      case 2 :
        for (String name : names)
        {
          boolean checkName = true;
          Function<String, Boolean> nameCheck = name1 -> name1.contains("a");
          if (checkName && nameCheck.apply(name))
          {
            Function<String, String> specialGreetingFunc = name1 -> name1.toUpperCase() + "! Yay " + name1 + "!";
            sing(specialGreetingFunc.apply(name));
          }
          else
          {
            sing("Hello " + name + ", it's nice to meet you.");
          }
        }
        break;
      case 3 :
        for (String name : names)
        {
          boolean checkName = false;
          Function<String, Boolean> nameCheck = name1 -> name1.startsWith("L");
          if (checkName && nameCheck.apply(name))
          {
            Function<String, String> specialGreetingFunc = name1 -> "Hip Hip Hurray! For " + name1;
            sing(specialGreetingFunc.apply(name));
          }
          else
          {
            sing("Hello " + name + ", it's nice to meet you.");
          }
        }
        break;
    }
  }
}
