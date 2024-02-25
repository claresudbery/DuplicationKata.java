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
            int startOffset = 0;
            if (checkNameStart && name.startsWith(namePrefix, startOffset)) {
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
            int startOffset = 1;
            if (checkNameStart && name.startsWith(namePrefix, startOffset)) {
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
              int startOffset = 0;
              if (checkNameStart && name.startsWith(namePrefix, startOffset)) {
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
