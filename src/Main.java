import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mainChoice;
    Methods methods = new Methods();

    do {
      // === ГЛАВНОЕ МЕНЮ ===
      System.out.println("=== ГЛАВНОЕ МЕНЮ ===");
      System.out.println("1. Методы");
      System.out.println("2. Условия");
      System.out.println("3. Циклы");
      System.out.println("4. Массивы");
      System.out.println("0. Выход");
      System.out.print("Выберите категорию: ");

      // Обработка некорректного ввода
      while (!scanner.hasNextInt()) {
        System.out.println("Ошибка! Введите число от 0 до 4.");
        scanner.next();
      }
      mainChoice = scanner.nextInt();

      // Навигация по разделам
      switch (mainChoice) {
        case 1:
          methodsMenu(scanner, methods);
          break;
        case 2:
          conditionsMenu(scanner, methods);
          break;
        case 3:
          loopsMenu(scanner, methods); ;
        case 4:
          arraysMenu(scanner, methods); // Меню массивов
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

  // ========== РАЗДЕЛ МЕТОДОВ ==========
  private static void methodsMenu(Scanner scanner, Methods methods) {
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
          System.out.print("Введите число: ");
          double num = scanner.nextDouble();
          System.out.println("Дробная часть: " + methods.fraction(num));
          break;
        case 2:
          System.out.print("Введите цифру: ");
          char digit = scanner.next().charAt(0);
          System.out.println("Число: " + methods.charToNum(digit));
          break;
        case 3:
          System.out.print("Введите число: ");
          int num2 = scanner.nextInt();
          System.out.println("Результат: " + methods.is2Digits(num2));
          break;
        case 4:
          System.out.print("Введите границу a: ");
          int a = scanner.nextInt();
          System.out.print("Введите границу b: ");
          int b = scanner.nextInt();
          System.out.print("Введите число num: ");
          int num3 = scanner.nextInt();
          System.out.println("Результат: " + methods.isInRange(a, b, num3));
          break;
        case 5:
          System.out.print("Введите a: ");
          int a2 = scanner.nextInt();
          System.out.print("Введите b: ");
          int b2 = scanner.nextInt();
          System.out.print("Введите c: ");
          int c = scanner.nextInt();
          System.out.println("Результат: " + methods.isEqual(a2, b2, c));
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }

  // ========== РАЗДЕЛ УСЛОВИЙ ==========
  private static void conditionsMenu(Scanner scanner, Methods methods) {
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
          System.out.print("Введите число: ");
          int num = scanner.nextInt();
          System.out.println("Модуль: " + methods.abs(num));
          break;
        case 2:
          System.out.print("Введите число: ");
          int num2 = scanner.nextInt();
          System.out.println("Результат: " + methods.is35(num2));
          break;
        case 3:
          System.out.print("Введите x: ");
          int x = scanner.nextInt();
          System.out.print("Введите y: ");
          int y = scanner.nextInt();
          System.out.print("Введите z: ");
          int z = scanner.nextInt();
          System.out.println("Максимум: " + methods.max3(x, y, z));
          break;
        case 4:
          System.out.print("Введите x: ");
          int x2 = scanner.nextInt();
          System.out.print("Введите y: ");
          int y2 = scanner.nextInt();
          System.out.println("Сумма: " + methods.sum2(x2, y2));
          break;
        case 5:
          System.out.print("Введите день недели (1-7): ");
          int dayNum = scanner.nextInt();
          System.out.println("День: " + methods.day(dayNum));
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }

  // ========== РАЗДЕЛ ЦИКЛОВ ==========
  private static void loopsMenu(Scanner scanner, Methods methods) {
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
          System.out.print("Введите x: ");
          int x = scanner.nextInt();
          System.out.println("Результат: " + methods.listNums(x));
          break;
        case 2:
          System.out.print("Введите x: ");
          int x2 = scanner.nextInt();
          System.out.println("Результат: " + methods.chet(x2));
          break;
        case 3:
          System.out.print("Введите число: ");
          long num = scanner.nextLong();
          System.out.println("Длина: " + methods.numLen(num));
          break;
        case 4:
          System.out.print("Введите размер: ");
          int size = scanner.nextInt();
          methods.square(size);
          break;
        case 5:
          System.out.print("Введите высоту: ");
          int height = scanner.nextInt();
          methods.rightTriangle(height);
          break;
        case 0:
          System.out.println("Возврат в главное меню...");
          break;
        default:
          System.out.println("Неверный выбор! Попробуйте снова.");
      }
    } while (choice != 0);
  }

  // ========== РАЗДЕЛ МАССИВОВ ==========
  private static void arraysMenu(Scanner scanner, Methods methods) {
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
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr = methods.parseArray(scanner.nextLine());
          if (arr.length == 0) {
            System.out.println("Ошибка: массив не может быть пустым!");
            break;
          }
          System.out.print("Введите искомый элемент: ");
          int target = scanner.nextInt();
          System.out.println("Индекс: " + methods.findFirst(arr, target));
          break;
        case 2:
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr2 = methods.parseArray(scanner.nextLine());
          if (arr2.length == 0) {
            System.out.println("Ошибка: массив не может быть пустым!");
            break;
          }
          System.out.println("Макс. по модулю: " + methods.maxAbs(arr2));
          break;
        case 3:
          System.out.println("Введите основной массив (через пробел):");
          scanner.nextLine();
          int[] mainArr = methods.parseArray(scanner.nextLine());
          System.out.println("Введите массив для вставки (через пробел):");
          int[] insArr = methods.parseArray(scanner.nextLine());
          if (mainArr.length == 0 && insArr.length == 0) {
            System.out.println("Ошибка: оба массива не могут быть пустыми!");
            break;
          }
          System.out.print("Введите позицию: ");
          int pos = scanner.nextInt();
          if (pos < 0 || pos > mainArr.length) {
            System.out.println("Ошибка: позиция должна быть в диапазоне от 0 до " + mainArr.length);
            break;
          }
          System.out.println("Результат: " + Arrays.toString(methods.add(mainArr, insArr, pos)));
          break;
        case 4:
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr3 = methods.parseArray(scanner.nextLine());
          if (arr3.length == 0) {
            System.out.println("Ошибка: массив не может быть пустым!");
            break;
          }
          System.out.println("Перевёрнутый: " + Arrays.toString(methods.reverseBack(arr3)));
          break;
        case 5:
          System.out.println("Введите массив (через пробел):");
          scanner.nextLine();
          int[] arr4 = methods.parseArray(scanner.nextLine());
          if (arr4.length == 0) {
            System.out.println("Ошибка: массив не может быть пустым!");
            break;
          }
          System.out.print("Введите искомый элемент: ");
          int target2 = scanner.nextInt();
          System.out.println("Индексы: " + Arrays.toString(methods.findAll(arr4, target2)));
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
