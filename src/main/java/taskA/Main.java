package taskA;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
// задан массив, делаю копию в виде списка и в этой копию заменяю элементы на правильные места
            // Проблема: как считать из файла в массив строки с переносом строки?
        String[] str = new String[]{"str3", "1smth", "bla2bla"};
        List<String> bibl = Arrays.asList("str3", "1smth", "bla2bla");

        for (int i = 0; i < str.length; i++) {
            String line = str[i];
            int number = Integer.parseInt(line.replaceAll("[^0-9]", ""));
            String strStr = line.replaceAll("\\d", "");
            bibl.set((number - 1), strStr);

        }
        for (String newStr : bibl) {
            System.out.println(newStr);
        }
    }
}
//Вариант со считываем из файла.
// Проблема: зависает.
//    Map<Integer, String> bibl = new TreeMap<>();
//
//    Scanner sc = new Scanner(System.in);
//            System.out.println("Введите массив строк");
//
//                    while (sc.hasNext()) {
//                    String input = sc.nextLine();
//                    int number = Integer.parseInt(input.replaceAll("[^0-9]", ""));
//                    String strStr = input.replaceAll("\\d", "");
//                    bibl.put((number - 1), strStr);
//
//                    }
//                    for (Map.Entry e : bibl.entrySet()) {
//                    System.out.println(e.getValue());
//                    }


//Вариант первый, самый закрученный
//        String[] str = new String[]{"str3", "1smth", "bla2bla"};
//        Integer[] onlyNumber = new Integer[str.length];
//        String[] onlyStr = new String[str.length];
//
//        for (int i = 0; i < str.length; i++) {
//        String line = str[i];
//        int number = Integer.parseInt(line.replaceAll("[^0-9]", ""));
//        onlyNumber[i] = number;
//        String strStr = line.replaceAll("\\d", "");
//        onlyStr[i] = strStr;
//        }
//        Map<Integer, String> bibl = new TreeMap<>();
//        for (int i = 0; i < onlyNumber.length; i++) {
//        bibl.put(onlyNumber[i], onlyStr[i]);
//        }
//        for (Map.Entry e : bibl.entrySet()) {
//        System.out.println(e.getValue());
//        }

//Создание списка, который заполняем null, чтобы можно было вставлять на нужный индекс
//Работает, но извращение какое-то, если честно
// String[] str = new String[]{"str3", "1smth", "bla2bla"};
//
//        List<String> biblio = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//        biblio.add(null);
//        }
//        for (int i = 0; i < str.length; i++) {
//        String line = str[i];
//        int number = Integer.parseInt(line.replaceAll("[^0-9]", ""));
//        String strStr = line.replaceAll("\\d", "");
//        biblio.set((number - 1), strStr);
//        }



