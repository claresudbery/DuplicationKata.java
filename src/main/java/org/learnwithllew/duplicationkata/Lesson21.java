package org.learnwithllew.duplicationkata;

public class Lesson21 extends Song
{
  public void singSong(int style, String... names)
  {
    switch (style)
    {
      case 1 : {
          for (String name : names) {
            boolean checkNameStart = true;
            String namePrefix = "L";
            String specialGreeting = "Hip Hip Hurray! For ";
            if (checkNameStart && name.startsWith(namePrefix, 0)) {
              sing(specialGreeting + name);
            } else {
              sing("Hello " + name + ", it's nice to meet you.");
            }
          }
        }
        break;
      case 2 : {
          for (String name : names) {
            boolean checkNameStart = true;
            String namePrefix = "am";
            String specialGreeting = "Say yeah! Say yo! Say ";
            if (checkNameStart && name.startsWith(namePrefix, 1)) {
              sing(specialGreeting + name);
            } else {
              sing("Hello " + name + ", it's nice to meet you.");
            }
          }
        }
        break;
      case 3 : {
            for (String name : names) {
              boolean checkNameStart = false;
              String namePrefix = "L";
              String specialGreeting = "Hip Hip Hurray! For ";
              if (checkNameStart && name.startsWith(namePrefix, 0)) {
                sing(specialGreeting + name);
              } else {
                sing("Hello " + name + ", it's nice to meet you.");
              }
            }
          }
        break;
    }
  }
}
