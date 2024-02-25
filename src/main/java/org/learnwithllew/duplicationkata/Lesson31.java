package org.learnwithllew.duplicationkata;

public class Lesson31 extends Song
{
  public void singSong(int style, String... names)
  {
    switch (style)
    {
      case 1 :
        for (String name : names)
        {
          boolean checkNameStart = true;
          if (checkNameStart && name.startsWith("L"))
          {
            sing("Hip Hip Hurray! For " + name);
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
          boolean checkNameStart = true;
          if (checkNameStart && name.contains("a"))
          {
            sing(name.toUpperCase() + "! Yay " + name + "!");
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
          boolean checkNameStart = false;
          if (checkNameStart && name.startsWith("L"))
          {
            sing("Hip Hip Hurray! For " + name);
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
