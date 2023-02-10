import java.io.FileWriter;
import java.io.IOException;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */
public class task1 {
    public static void main(String[] args) throws IOException {
        Integer[] arr = new Integer[] {5, 4, 8, 1, 3, 7, 9, 12, 0};
        FileWriter writer = new FileWriter("log.txt");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]){
                    int x = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = x;
                    writer.write("[");
                    for (Integer in : arr) {
                        writer.write(in.toString());
                        writer.write(", ");
                    }
                    writer.write("]\n");
                }
            }
        }
        writer.close();
    }
}
