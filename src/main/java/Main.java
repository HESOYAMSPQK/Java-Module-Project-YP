import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Race race = new Race();

      for (int i=1; i<=3;i++) {
          System.out.println("Введите название машины №" + i);
          String name = scanner.next();
          int speed;
          while (true) {
             try {
                 System.out.print("Введите скорость машины №" + i + "(от 0 до 250 км/ч): ");
                 speed = scanner.nextInt();

                 if (speed >= 0 && speed <= 250) {
                     break;
                 } else {
                     System.out.println("Ошибка: Скорость должна быть в диапазоне от 0 до 250 км/ч.");
                 }
             }catch (InputMismatchException e) {
                 System.out.println("Ошибка: введите корректное число для скорости.");
                 scanner.next();
               }
          }
          Auto auto = new Auto(name,speed);
          race.newLeaderUpdate(auto);

      }
        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
    }
}

