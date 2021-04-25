import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Model {
    private static MainView mainView;
    private String fileName;
    private static String text;
    private static Map<Character, Integer> map;
    private static Map<String, Integer> wordsMap;

    public Model(MainView view) {
        mainView = view;
    }

    protected void doAction(String command) {
        this.fileName = mainView.getFileName();
        this.readFile();
        switch (command) {
            case "countChar" :
                this.setTotalChars();
                this.setTotalCharsWithoutSpace();
                this.setMap();
                mainView.countChars();
                break;
            case "countWords" :
                this.setTotalWordsLength();
                this.setWordsMap();
                mainView.countWords();
                break;
            case "syllables" :
                mainView.addContentInBigFormat("Valid only for english alphabet\n" + this.divideIntoWords(text));
                break;
            case "search" :
                mainView.addContentInBigFormat(search(mainView.getSearch()));
                break;
            case "palindromes" :
                mainView.addContentInBigFormat(getPalindromes(text));
                break;
            case "repeatedSymbols" :
                mainView.addContentInBigFormat(getRepeatedSymbols(text));
                break;
            case "replace" :
                mainView.addContentInBigFormat(replace(mainView.getSearch(), mainView.getReplace()));
                break;
            case "substring" :
                mainView.addContentInBigFormat(subString(mainView.getSearch()));
                break;
            case "past" :
                mainView.addContentInBigFormat(printPast(mainView.getSearch()));
                break;
            case "future" :
                mainView.addContentInBigFormat(printFuture(mainView.getSearch()));
                break;

            case "character-asc" :
                mainView.addContent(setContent(Objects.requireNonNull(sort("character", "asc"))));
                break;
            case "character-desc" :
                mainView.addContent(setContent(Objects.requireNonNull(sort("character", "desc"))));
                break;
            case "frequency-asc" :
                mainView.addContent(setContent(Objects.requireNonNull(sort("frequency", "asc"))));
                break;
            case "frequency-desc" :
                mainView.addContent(setContent(Objects.requireNonNull(sort("frequency", "desc"))));
                break;
            case "word-asc" :
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word", "asc"))));
                break;
            case "word-desc" :
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word", "desc"))));
                break;
            case "word-frequency-asc" :
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word-frequency", "asc"))));
                break;
            case "word-frequency-desc" :
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word-frequency", "desc"))));
                break;
            default:
                System.out.println("Something went wrong(");
                break;
        }
    }

    private void readFile() {
        text = "";
        try  {
            File file = new File(this.fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                text += reader.nextLine();
                text += " \n";
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found");
            e.printStackTrace();
        }
    }

    private void setTotalChars() {
        int length = text.length();
        mainView.setTotalChars(length);
    }

    private void setTotalCharsWithoutSpace() {
        String text = Model.text.replace(" ", "");
        mainView.setTotalCharsWithoutSpace(text.length());
    }

    private void setTotalWordsLength() {
        mainView.setTotalWordsLength(text.split(" ").length);
    }

    private void setMap() {
        map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == ' ' || letter == '\n')
                continue;
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }
    }

    private void setWordsMap() {
        wordsMap = new HashMap<>();
        String[] rows = text.split("\n");
        for (String row : rows) {
            String[] words = row.split(" ");
            for (String word : words) {
                if (word.equals(" ") || word.equals("\n"))
                    continue;
                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } else {
                    wordsMap.put(word, 1);
                }
            }
        }
    }

    private String setContent(Map<Character, Integer> newMap) {
        String result = "";
        for (Map.Entry<Character, Integer> item : newMap.entrySet()) {
            String itemValue;
            if (item.getKey() == ' ')
                itemValue = "_ \t " + item.getValue() + "\n";
            else
                itemValue = item.getKey() + " \t " + item.getValue() + "\n";
            result += itemValue;
        }
        return result;
    }

    private Map<Character, Integer> sort(String filter, String way) {
        Map<Character, Integer> treeMap = null;

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        if (way.equals("asc")) {
            switch (filter) {
                case "character" : return new TreeMap<>(map);
                case "frequency" :
                    treeMap = new LinkedHashMap<>();
                    for (Map.Entry<Character, Integer> entry : list) {
                        treeMap.put(entry.getKey(), entry.getValue());
                    }
                    return treeMap;
            }
        } else if (way.equals("desc")) {
            switch (filter) {
                case "character" :
                    treeMap = new TreeMap<>(map);
                    Map<Character, Integer> orderedMap = new TreeMap(Collections.reverseOrder());
                    orderedMap.putAll(treeMap);
                    return orderedMap;
                case "frequency" :
                    treeMap = new LinkedHashMap<>();
                    Collections.reverse(list);
                    for (Map.Entry<Character, Integer> entry : list) {
                        treeMap.put(entry.getKey(), entry.getValue());
                    }
                    return treeMap;
            }
        }
        return treeMap;
    }


    private String setWordContent(Map<String, Integer> newMap) {
        String result = "";
        for (Map.Entry<String, Integer> item : newMap.entrySet()) {
            String itemValue = item.getKey() + " \t " + item.getValue() + "\n";
            result += itemValue;
        }
        return result;

    }

    private Map<String, Integer> sortWords(String filter, String way) {
        Map<String, Integer> treeMap = null;

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        if (way.equals("asc")) {
            switch (filter) {
                case "word" : return new TreeMap<>(wordsMap);
                case "word-frequency" :
                    treeMap = new LinkedHashMap<>();
                    for (Map.Entry<String, Integer> entry : list) {
                        treeMap.put(entry.getKey(), entry.getValue());
                    }
                    return treeMap;
            }
        } else if (way.equals("desc")) {
            switch (filter) {
                case "word" :
                    treeMap = new TreeMap(wordsMap);
                    Map<String, Integer> orderedMap = new TreeMap<>(Collections.reverseOrder());
                    orderedMap.putAll(treeMap);
                    return orderedMap;
                case "word-frequency" :
                    treeMap = new LinkedHashMap<>();
                    Collections.reverse(list);
                    for (Map.Entry<String, Integer> entry : list) {
                        treeMap.put(entry.getKey(), entry.getValue());
                    }
                    return treeMap;
            }
        }
        return treeMap;
    }

    private String divideIntoWords(String text) {
        String[] words = text.split(" ");
        String result = "";
        for (String word : words) {
            result += divideIntoSyllables(word);
            result += "\n";
        }
        return result;
    }

    private String divideIntoSyllables(String word) {
        StringBuilder result = new StringBuilder();
        char[] chars = word.toCharArray();
        int i;
        List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y');
        for (i = 0; i < chars.length; i++) {

            result.append(chars[i]);
            if (vowels.contains(chars[i])) {
                if (i+1 < chars.length && vowels.contains(chars[i+1])) {
                    result.append('-');

                } else if (i+1 < chars.length && !vowels.contains(chars[i+1])) {
                    if (i+2 < chars.length && vowels.contains(chars[i+2])) {
                        result.append('-');
                        result.append(chars[i+1]);
                        i += 1;
                    } else if (i+2 < chars.length && !vowels.contains(chars[i+2])){
                        result.append(chars[i+1]);
                        result.append('-');
                        result.append(chars[i+2]);
                        i += 2;
                    } else {
                        result.append(chars[i+1]);
                        i+=1;
                    }
                }
            } else {
                if (i+1 < chars.length && !vowels.contains(chars[i+1])) {
                    result.append('-');

                }
            }
        }
        return result.toString();
    }

    private String search(String word) {
        List<String> textList = Arrays.asList(text.split("\n"));
        int i = 0, pos, row = 0;
        if (text.contains(word)) {
            pos = text.indexOf(word);
            while (pos  >= textList.get(i).length()) {
                row++;
                pos -= textList.get(i).length();
                i++;
            }
            return word + "\nRow:\t" + row + "\nPosition:\t" + pos;
        }
        else
            return "Nothing found for value:\n" + word;
    }

    private String getPalindromes(String text) {
        StringBuilder result = new StringBuilder();
        List<String> rows = Arrays.asList(text.split("\n"));
        for (int i = 0; i < rows.size(); i++) {
            String row = rows.get(i);
            if (isPalindrome(row)) {
                result.append("\n").append(row).append("\nRow:\t").append(i + 1).append("\nPosition:\t0\n");
            }
            String[] words = row.split(" ");
            int pos = 0;
            for (String word : words) {
                if (isPalindrome(word)) {
                    result.append("\n").append(word).append("\nRow:\t").append(i + 1).append("\nPosition:\t").append(pos + 1).append("\n");
                }
                pos += word.length();
            }
        }
        return result.toString();
    }

    private boolean isPalindrome(String text) {
        text = text.replace(" ", "");
        int length = text.length();
        int start = 0, end = length - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    private String getRepeatedSymbols(String text) {
        int count = 0, total = 0;
        for (int i = 0; i < text.length()-1; i++) {
            char character = text.charAt(i),  next = text.charAt(i+1);
            if (character == next) {
                count++;
            }
            else {
                total += count;
                count = 0;
            }
        }
        return text + "\nNumber of repeated symbols:\t" + total;
    }

    private String replace(String string1, String string2) {
        int count = 0;
        while (text.contains(string1)) {
            text = text.replace(string1, string2);
            count++;
        }
        this.writeToFile(text);
        return "Replaced items number:\t" + count;
    }

    private void writeToFile(String text) {
        try {
            FileWriter myWriter = new FileWriter(this.fileName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private String subString(String string1) {
        while (!text.contains(string1)) {
            string1 = string1.substring(0, string1.length() - 1);
            System.out.println(string1);
        }
        int pos = text.indexOf(string1);
        if (pos == -1)
            return "Nothing found";
        return "Result:\n" +
                "The longest substring found at position \t#" + pos +
                "\nThe longest substring found is: \t" + string1;
    }

    private String printPast(String word) {
        byte[] bytes = word.getBytes(StandardCharsets.UTF_8);
        String value = new String(bytes, StandardCharsets.UTF_8);
        String result = value;
        boolean consonant = false;
        List<Character> vowels = Arrays
                .asList('А', 'Е', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я', 'а', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я');

        for (int i = value.length() - 1; i >= 0 ; i--) {
            char character = value.charAt(i);

            if (consonant && !vowels.contains(character))
                continue;

            if (i == value.length() - 1 && vowels.contains(character)) {
                if (character == 'а' || character == 'ы')
                    result += "ды";
                else if (character == 'А' || character == 'Ы')
                    result += "ДЫ";
                else if (character == 'Я' || character == 'И' || character == 'Е' || character == 'Э')
                    result += "ДИ";
                else if (character == 'я' || character == 'и' || character == 'е' || character == 'э')
                    result += "ди";
                else if (character == 'У' || character == 'О' || character == 'Ю')
                    result += "ДУ";
                else if (character == 'у' || character == 'о' || character == 'ю')
                    result += "ду";

                break;
            }
            else if (!vowels.contains(character)) {
                if (character == 'к' || character == 'п' || character == 'с' || character == 'т'
                        || character == 'ф' || character == 'х' || character == 'ц' || character == 'ч'
                        || character == 'ш' || character == 'щ') {
                    result += 'т';
                } else if (character == 'К' || character == 'П' || character == 'С' || character == 'Т'
                        || character == 'Ф' || character == 'Х' || character == 'Ц' || character == 'Ч'
                        || character == 'Ш' || character == 'Щ') {
                    result += 'Т';
                } else if (character == 'б' || character == 'в' || character == 'г' || character == 'д'
                        || character == 'ж' || character == 'з' || character == 'л' || character == 'м'
                        || character == 'н' || character == 'р' || character == 'й') {
                    result += 'д';
                } else if (character == 'Б' || character == 'В' || character == 'Г' || character == 'Д'
                        || character == 'Ж' || character == 'З' || character == 'Л' || character == 'М'
                        || character == 'Н' || character == 'Р' || character == 'Й') {
                    result += 'Д';
                }
                consonant = true;
            } else {
                if (character == 'а' || character == 'ы') {
                    result += "ы";
                }
                else if (character == 'А' || character == 'Ы') {
                    result += "Ы";
                }
                else if (character == 'Я' || character == 'И' || character == 'Е' || character == 'Э') {
                    result += "И";
                }
                else if (character == 'я' || character == 'и' || character == 'е' || character == 'э') {
                    result += "и";
                }
                else if (character == 'У' || character == 'О' || character == 'Ю') {
                    result += "У";
                }
                else if (character == 'у' || character == 'о' || character == 'ю') {
                    result += "у";
                }
                break;
            }
        }
        return "Verb:\t\t" + value +
                "\nPast form:\t\t" + result;
    }

    private String printFuture(String word) {
        byte[] bytes = word.getBytes(StandardCharsets.UTF_8);
        String value = new String(bytes, StandardCharsets.UTF_8);
        String result = value;
        String response = "Verb:\t\t" + value + "\nFuture form:\t\t";
        List<Character> vowels = Arrays
                .asList('А', 'Е', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я', 'а', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я');

        char first = value.charAt(value.length() - 1);
        if (vowels.contains(first)) {
            return response + result + "йт";
        }

        else {
            if (first == 'к' || first == 'К') {
                result = result.substring(0, result.length() - 1);
                result += 'г';
            }
            if (first == 'п' || first == 'П') {
                result = result.substring(0, result.length() - 1);
                result += 'б';
            }

            for (int i = value.length() -2; i >= 0; i--) {
                char second = value.charAt(i);
                if (vowels.contains(second)) {
                    if (second == 'е' || second == 'Е' || second == 'и' || second == 'И') {
                        return response + result + "ет";
                    }
                    if (second == 'о' || second == 'О') {
                        return response + result + "от";
                    }
                    if (second == 'у' || second == 'ы' || second == 'а' || second == 'У' || second == 'Ы' || second == 'А') {
                        return response + result + "ат";
                    }
                }
            }
        }
        return response + result;
    }
}
