import java.util.Scanner;

/*
 * Напишите метод, который принимает на вход строку (String) и определяет,
 * является ли строка палиндромом (возвращает boolean значение).
 */
public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scan.nextLine();
        scan.close();
        StringBuilder sb = new StringBuilder(line);
        StringBuilder sb1 = new StringBuilder(line);
        System.out.println(sb1 == sb.reverse());        
    }
}
