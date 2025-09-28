
public class Methods {

  // ========== МЕТОДЫ РАБОТЫ С ЧИСЛАМИ ==========

  // Возвращает дробную часть числа
  public double fraction(double x) {
    return x - (int) x;
  }

  // Конвертирует символ-цифру в соответствующее число
  public int charToNum(char x) {
    return x - '0';
  }

  // Проверяет, является ли число двузначным
  public boolean is2Digits(int x) {
    return x >= 10 && x <= 99;
  }

  // Проверяет, принадлежит ли число диапазону [a, b]
  public boolean isInRange(int a, int b, int num) {
    return num >= Math.min(a, b) && num <= Math.max(a, b);
  }

  // Проверяет равенство трех чисел
  public boolean isEqual(int a, int b, int c) {
    return a == b && b == c;
  }

  // ========== МЕТОДЫ УСЛОВНЫХ ОПЕРАТОРОВ ==========

  // Возвращает модуль числа
  public int abs(int x) {
    return x < 0 ? -x : x;
  }

  // Проверяет делимость на 3 ИЛИ 5, но не на оба одновременно
  public boolean is35(int x) {
    return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
  }

  // Находит максимальное из трех чисел
  public int max3(int x, int y, int z) {
    int max = x;
    if (y > max) {
      max = y;
    }
    if (z > max) {
      max = z;
    }
    return max;
  }

  // Возвращает сумму чисел, заменяя её на 20 если сумма в диапазоне [10, 19]
  public int sum2(int x, int y) {
    int sum = x + y;
    return (sum >= 10 && sum <= 19) ? 20 : sum;
  }

  // Возвращает название дня недели по номеру
  public String day(int x) {
    if (x == 1) {
      return "понедельник";
    } else if (x == 2) {
      return "вторник";
    } else if (x == 3) {
      return "среда";
    } else if (x == 4) {
      return "четверг";
    } else if (x == 5) {
      return "пятница";
    } else if (x == 6) {
      return "суббота";
    } else if (x == 7) {
      return "воскресенье";
    } else {
      return "это не день недели";
    }
  }

  // ========== МЕТОДЫ РАБОТЫ С ЦИКЛАМИ ==========

  // Возвращает строку с числами от 0 до x включительно
  public String listNums(int x) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= x; i++) {
      sb.append(i).append(" ");
    }
    return sb.toString().trim();
  }

  // Возвращает строку с четными числами от 0 до x
  public String chet(int x) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= x; i += 2) {
      sb.append(i).append(" ");
    }
    return sb.toString().trim();
  }

  // Подсчитывает количество цифр в числе
  public int numLen(long x) {
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

  // Рисует квадрат из звёздочек заданного размера
  public void square(int x) {
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

  // Рисует прямоугольный треугольник из звёздочек
  public void rightTriangle(int x) {
    for (int i = 1; i <= x; i++) {
      // Печать пробелов
      for (int j = 0; j < x - i; j++) {
        System.out.print(" ");
      }
      // Печать звёздочек
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // ========== МЕТОДЫ РАБОТЫ С МАССИВАМИ ==========

  // Находит первый индекс элемента в массиве
public int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    System.out.println("Элемент " + x + " не найден в массиве");
    return -1;
  }

  // Находит элемент с максимальным модулем
  public int maxAbs(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      if (Math.abs(num) > Math.abs(max)) {
        max = num;
      }
    }
    return max;
  }

  // Вставляет один массив в другой на указанную позицию
  public int[] add(int[] arr, int[] ins, int pos) {
    int[] result = new int[arr.length + ins.length];
    // Копируем левую часть исходного массива
    System.arraycopy(arr, 0, result, 0, pos);
    // Вставляем новый массив
    System.arraycopy(ins, 0, result, pos, ins.length);
    // Копируем правую часть исходного массива
    System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
    return result;
  }

  // Возвращает перевернутую копию массива
  public int[] reverseBack(int[] arr) {
    int[] reversed = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      reversed[i] = arr[arr.length - 1 - i];
    }
    return reversed;
  }

  // Находит все индексы вхождения элемента в массив
  public int[] findAll(int[] arr, int x) {
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

  // Преобразует строку чисел в массив
  public int[] parseArray(String input) {
    if (input.trim().isEmpty()) {
      return new int[0];
    }
    String[] parts = input.trim().split("\\s+");
    int[] result = new int[parts.length];
    for (int i = 0; i < parts.length; i++) {
      result[i] = Integer.parseInt(parts[i]);
    }
    return result;
  }
}

