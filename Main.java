import java.io.BufferedReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final char[] arrRU = {' ', '!', '"', ',', '-', '.', ':', '?',
            'Ё', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З',
            'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т',
            'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
            'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т',
            'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'ё'};

    public static void main(String[] args) {
        Path pathIN = Path.of("C:/test1/test.txt");
        Path pathOUT = Paths.get(getNewFileName(pathIN.toString()));

        try (FileChannel fileChannel = FileChannel.open(pathIN, StandardOpenOption.READ);
             BufferedReader bf = new BufferedReader(fileChannel., 1024)) {

            char[] buf = new char[1024];
            buf = fileChannel.read();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int getIndex(char ch) {
        return Arrays.binarySearch(arrRU, ch);
    }

    public static char getCharFromIndex(int index, int key) {
        return 1;
    }

    public static String getNewFileName(String oldFileName) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + "-crypt" + oldFileName.substring(dotIndex);
    }


}
