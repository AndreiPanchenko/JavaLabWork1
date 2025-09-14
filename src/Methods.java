import java.util.Arrays;

public class Methods {

  // Методы
  public static double fraction(double x) {
    return x - (int) x;
  }

  public static int charToNum(char x) {
    return x - '0';
  }

  public static boolean is2Digits(int x) {
    return x >= 10 && x <= 99;
  }

  public static boolean isInRange(int a, int b, int num) {
    return num >= Math.min(a, b) && num <= Math.max(a, b);
  }

  public static boolean isEqual(int a, int b, int c) {
    return a == b && b == c;
  }

  // Условия
  public static int abs(int x) {
    return x < 0 ? -x : x;
  }

  public static boolean is35(int x) {
    return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
  }

  public static int max3(int x, int y, int z) {
    int max = x;
    if (y > max) {
      max = y;
    }
    if (z > max) {
      max = z;
    }
    return max;
  }

  public static int sum2(int x, int y) {
    int sum = x + y;
    return (sum >= 10 && sum <= 19) ? 20 : sum;
  }

  public static String day(int x) {
    switch (x) {
      case 1:
        return "понедельник";
      case 2:
        return "вторник";
      case 3:
        return "среда";
      case 4:
        return "четверг";
      case 5:
        return "пятница";
      case 6:
        return "суббота";
      case 7:
        return "воскресенье";
      default:
        return "это не день недели";
    }
  }

  // Циклы
  public static String listNums(int x) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= x; i++) {
      sb.append(i).append(" ");
    }
    return sb.toString().trim();
  }

  public static String chet(int x) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= x; i += 2) {
      sb.append(i).append(" ");
    }
    return sb.toString().trim();
  }

  public static int numLen(long x) {
    if (x == 0) {
      return 1;
    }
    int count = 0;
    while (x != 0) {
      x /= 10;
      count++;
    }
    return count;
  }

  public static void square(int x) {
    if (x < 0) {
      System.out.println("Ошибка: размер не может быть отрицательным");
      return;
    }

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void rightTriangle(int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = 0; j < x - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Массивы
  public static int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public static int maxAbs(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      if (Math.abs(num) > Math.abs(max)) {
        max = num;
      }
    }
    return max;
  }

  public static int[] add(int[] arr, int[] ins, int pos) {
    int[] result = new int[arr.length + ins.length];

    for (int i = 0; i < pos; i++) {
      result[i] = arr[i];
    }

    for (int i = 0; i < ins.length; i++) {
      result[pos + i] = ins[i];
    }

    for (int i = pos; i < arr.length; i++) {
      result[ins.length + i] = arr[i];
    }

    return result;
  }

  public static int[] reverseBack(int[] arr) {
    int[] reversed = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      reversed[i] = arr[arr.length - 1 - i];
    }
    return reversed;
  }

  public static int[] findAll(int[] arr, int x) {
    int count = 0;
    for (int num : arr) {
      if (num == x) {
        count++;
      }
    }
    int[] indices = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        indices[index++] = i;
      }
    }
    return indices;
  }

  public static int[] parseArray(String input) {
    String[] parts = input.split(" ");       // Разбиваем строку на части
    int[] result = new int[parts.length];    // Создаем массив для чисел

    for (int i = 0; i < parts.length; i++) {
      result[i] = Integer.parseInt(parts[i]); // Преобразуем каждую строку в число
    }

    return result;
  }
}