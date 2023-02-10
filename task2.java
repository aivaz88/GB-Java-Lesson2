import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
"оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Если .txt
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("task2.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String[] data = new String[3];
        
        String line = reader.readLine();
        while (line != null){
            String[] arr = line.split(",");
            for (int i = 0; i < arr.length; i++) {
                String[] arr2 = arr[i].split(":");
                data[i] = arr2[1];
            }
            StringBuilder sb = new StringBuilder("Студент");
            sb.append(data[0]);
            sb.append(" получил");
            sb.append(data[1]);
            sb.append(" по предмету");
            sb.append(data[2]);
            System.out.println(sb.toString());            
            line = reader.readLine();
        }
    }
}
