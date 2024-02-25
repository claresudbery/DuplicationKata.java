package org.learnwithllew.duplicationkata;

public class Lesson21 extends Song
{
  public void singSong(int style, String... names)
  {
    switch (style)
    {
      case 1 : {
          singRefrain(names, true, "L", 0, "Hip Hip Hurray! For ");
      }
      break;
      case 2 : {
          singRefrain(names, true, "am", 1, "Say yeah! Say yo! Say ");
      }
      break;
      case 3 : {
          singRefrain(names, false, "L", 0, "Hip Hip Hurray! For ");
      }
      break;
    }
  }

  private void singRefrain(
          String[] names,
          boolean checkNameStart,
          String namePrefix,
          int startOffset,
          String specialGreeting) {
    for (String name : names) {
      if (checkNameStart && name.startsWith(namePrefix, startOffset)) {
        sing(specialGreeting + name);
      } else {
        sing("Hello " + name + ", it's nice to meet you.");
      }
    }
  }
}
