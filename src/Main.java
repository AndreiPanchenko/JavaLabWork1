import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mainChoice;

    do {
      System.out.println("=== ГЛАВНОЕ МЕНЮ ===");
      System.out.println("1. Методы");
      System.out.println("2. Условия");
      System.out.println("3. Циклы");
      System.out.println("4. Массивы");
      System.out.println("0. Выход");
      System.out.print("Выберите категорию: ");

      // Проверка ввода
      while (!scanner.hasNextInt()) {
        System.out.println("Ошибка! Введите число от 0 до 4.");
        scanner.next();
      }
      mainChoice = scanner.nextInt();

      switch (mainChoice) {
        case 1:
          methodsMenu(scanner);
          break;
        case 2:
          conditionsMenu(scanner);
          break;
        case 3:
          loopsMenu(scanner);
          break;
        case 4:
          arraysMenu(scanner);
          break;
        case 0:
          System.out.println("Выход из программы...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (mainChoice != 0);

    scanner.close();
  }

  // Меню для методов
  private static void methodsMenu(Scanner scanner) {
    int choice;
    do {
      System.out.println("=== МЕТОДЫ ===");
      System.out.println("1. Дробная часть");
      System.out.println("2. Букву в число");
      System.out.println("3. Двузначное");
      System.out.println("4. Диапазон");
      System.out.println("5. Равенство");
      System.out.println("0. Назад в главное меню");
      System.out.print("Выберите задачу: ");

      while (!scanner.hasNextInt()) {
        System.out.println("Ошибка! Введите число от 0 до 5.");
        scanner.next();
      }
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Задача: Дробная часть");
          System.out.println("Дана сигнатура метода: public double fraction (double x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х.");
          System.out.print("Введите число: ");
          double num = scanner.nextDouble();
          System.out.println("Дробная часть: " + Methods.fraction(num));
          break;
        case 2:
          System.out.println("Задача: Букву в число");
          System.out.println("Дана сигнатура метода: public int charToNum (char x);");
          System.out.println(
              "Метод принимает символ х, который представляет собой один из '0 1 2 3 4 5 6 7 8 9'.");
          System.out.print("Введите цифру: ");
          char digit = scanner.next().charAt(0);
          System.out.println("Число: " + Methods.charToNum(digit));
          break;
        case 3:
          System.out.println("Задача: Двузначное");
          System.out.println("Дана сигнатура метода: public bool is2Digits (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true, если оно двузначное.");
          System.out.print("Введите число: ");
          int num2 = scanner.nextInt();
          System.out.println("Результат: " + Methods.is2Digits(num2));
          break;
        case 4:
          System.out.println("Задача: Диапазон");
          System.out.println(
              "Дана сигнатура метода: public bool isInRange (int a, int b, int num);");
          System.out.println(
              "Метод принимает левую и правую границу (a и b) некоторого числового диапазона.");
          System.out.print("Введите границу a: ");
          int a = scanner.nextInt();
          System.out.print("Введите границу b: ");
          int b = scanner.nextInt();
          System.out.print("Введите число num: ");
          int num3 = scanner.nextInt();
          System.out.println("Результат: " + Methods.isInRange(a, b, num3));
          break;
        case 5:
          System.out.println("Задача: Равенство");
          System.out.println("Дана сигнатура метода: public bool isEqual(int a, int b, int c);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал true, если все три полученных методом числа равны");
          System.out.print("Введите a: ");
          int a2 = scanner.nextInt();
          System.out.print("Введите b: ");
          int b2 = scanner.nextInt();
          System.out.print("Введите c: ");
          int c = scanner.nextInt();
          System.out.println("Результат: " + Methods.isEqual(a2, b2, c));
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }

  // Меню для условий
  private static void conditionsMenu(Scanner scanner) {
    int choice;
    do {
      System.out.println("=== УСЛОВИЯ ===");
      System.out.println("1. Модуль числа");
      System.out.println("2. Тридцать пять");
      System.out.println("3. Тройной максимум");
      System.out.println("4. Двойная сумма");
      System.out.println("5. День недели");
      System.out.println("0. Назад в главное меню");
      System.out.print("Выберите задачу: ");

      while (!scanner.hasNextInt()) {
        System.out.println("Ошибка! Введите число от 0 до 5.");
        scanner.next();
      }
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Задача: Модуль числа");
          System.out.println("Дана сигнатура метода: public int abs (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х.");
          System.out.print("Введите число: ");
          int num = scanner.nextInt();
          System.out.println("Модуль: " + Methods.abs(num));
          break;
        case 2:
          System.out.println("Задача: Тридцать пять");
          System.out.println("Дана сигнатура метода: public bool is35 (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал true, если" +
                  "число x делится нацело на 3 или 5.\nПри этом, если оно делится и на 3, и на 5, то"
                  +
                  "вернуть надо false");
          System.out.print("Введите число: ");
          int num2 = scanner.nextInt();
          System.out.println("Результат: " + Methods.is35(num2));
          break;
        case 3:
          System.out.println("Задача: Тройной максимум");
          System.out.println("Дана сигнатура метода: public int max3 (int x, int y, int z);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел.");
          System.out.print("Введите x: ");
          int x = scanner.nextInt();
          System.out.print("Введите y: ");
          int y = scanner.nextInt();
          System.out.print("Введите z: ");
          int z = scanner.nextInt();
          System.out.println("Максимум: " + Methods.max3(x, y, z));
          break;
        case 4:
          System.out.println("Задача: Двойная сумма");
          System.out.println("Дана сигнатура метода: public int sum2 (int x, int y);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал сумму чисел x и y. " +
                  "\nОднако, если сумма попадает в диапазон от 10 до 19, то надо вернуть"
                  + " число 20. ");
          System.out.print("Введите x: ");
          int x2 = scanner.nextInt();
          System.out.print("Введите y: ");

          int y2 = scanner.nextInt();

          System.out.println("Сумма: " + Methods.sum2(x2, y2));
          break;
        case 5:
          System.out.println("Задача: День недели");
          System.out.println("Дана сигнатура метода: public String day (int x);");
          System.out.println("Метод принимает число x, обозначающее день недели.");
          System.out.print("Введите день недели (1-7): ");
          int dayNum = scanner.nextInt();
          System.out.println("День: " + Methods.day(dayNum));
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }

  // Меню для циклов
  private static void loopsMenu(Scanner scanner) {
    int choice;
    do {
      System.out.println("=== ЦИКЛЫ ===");
      System.out.println("1. Числа подряд");
      System.out.println("2. Четные числа");
      System.out.println("3. Длина числа");
      System.out.println("4. Квадрат");
      System.out.println("5. Правый треугольник");
      System.out.println("0. Назад в главное меню");
      System.out.print("Выберите задачу: ");

      while (!scanner.hasNextInt()) {
        System.out.println("Ошибка! Введите число от 0 до 5.");
        scanner.next();
      }
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Задача: Числа подряд");
          System.out.println("Дана сигнатура метода: public String listNums (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от 0 до x (включительно).");
          System.out.print("Введите x: ");
          int x = scanner.nextInt();
          System.out.println("Результат: " + Methods.listNums(x));
          break;
        case 2:
          System.out.println("Задача: Четные числа");
          System.out.println("Дана сигнатура метода: public String chet (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все четные числа от 0 до x (включительно).");
          System.out.print("Введите x: ");
          int x2 = scanner.nextInt();
          System.out.println("Результат: " + Methods.chet(x2));
          break;
        case 3:
          System.out.println("Задача: Длина числа");
          System.out.println("Дана сигнатура метода: public int numLen (long x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x.");
          System.out.print("Введите число: ");
          long num = scanner.nextLong();
          System.out.println("Длина: " + Methods.numLen(num));
          break;
        case 4:
          System.out.println("Задача: Квадрат");
          System.out.println("Дана сигнатура метода: public void square (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов '*' размером х.");
          System.out.print("Введите размер: ");
          int size = scanner.nextInt();
          Methods.square(size);
          break;
        case 5:
          System.out.println("Задача: Правый треугольник");
          System.out.println("Дана сигнатура метода: public void rightTriangle (int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов '*' у которого х символов в высоту.");
          System.out.print("Введите высоту: ");
          int height = scanner.nextInt();
          Methods.rightTriangle(height);
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }

  // Меню для массивов
  private static void arraysMenu(Scanner scanner) {
    int choice;
    do {
      System.out.println("=== МАССИВЫ ===");
      System.out.println("1. Поиск первого значения");
      System.out.println("2. Поиск максимального");
      System.out.println("3. Добавление массива в массив");
      System.out.println("4. Возвратный реверс");
      System.out.println("5. Все вхождения");
      System.out.println("0. Назад в главное меню");
      System.out.print("Выберите задачу: ");

      while (!scanner.hasNextInt()) {
        System.out.println("Ошибка! Введите число от 0 до 5.");
        scanner.next();
      }
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Задача: Поиск первого значения");
          System.out.println("Дана сигнатура метода: public int findFirst (int[] arr, int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr.");
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr = Methods.parseArray(scanner.nextLine());
          System.out.print("Введите искомый элемент: ");
          int target = scanner.nextInt();
          System.out.println("Индекс: " + Methods.findFirst(arr, target));
          break;
        case 2:
          System.out.println("Задача: Поиск максимального");
          System.out.println("Дана сигнатура метода: public int maxAbs (int[] arr);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю значение массива arr.");
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr2 = Methods.parseArray(scanner.nextLine());
          System.out.println("Макс. по модулю: " + Methods.maxAbs(arr2));
          break;
        case 3:
          System.out.println("Задача: Добавление массива в массив");
          System.out.println(
              "Дана сигнатура метода: public int[] add (int[] arr, int[] ins, int pos);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будут вставлены значения массива ins.");
          System.out.println("Введите основной массив (через пробел):");
          scanner.nextLine();
          int[] mainArr = Methods.parseArray(scanner.nextLine());
          System.out.println("Введите массив для вставки (через пробел):");
          int[] insArr = Methods.parseArray(scanner.nextLine());
          System.out.print("Введите позицию: ");
          int pos = scanner.nextInt();
          System.out.println("Результат: " + Arrays.toString(Methods.add(mainArr, insArr, pos)));
          break;
        case 4:
          System.out.println("Задача: Возвратный реверс");
          System.out.println("Дана сигнатура метода: public int[] reverseBack (int[] arr);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.");
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr3 = Methods.parseArray(scanner.nextLine());
          System.out.println("Перевёрнутый: " + Arrays.toString(Methods.reverseBack(arr3)));
          break;
        case 5:
          System.out.println("Задача: Все вхождения");
          System.out.println("Дана сигнатура метода: public int[] findAll (int[] arr, int x);");
          System.out.println(
              "Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны индексы всех вхождений числа x в массив arr.");
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr4 = Methods.parseArray(scanner.nextLine());
          System.out.print("Введите искомый элемент: ");
          int target2 = scanner.nextInt();
          System.out.println("Индексы: " + Arrays.toString(Methods.findAll(arr4, target2)));
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }
}