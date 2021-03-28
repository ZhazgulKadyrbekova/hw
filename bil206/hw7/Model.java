import java.io.File;
import java.io.FileNotFoundException;
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
                if (word == " " || word == "\n")
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
        int i = 0, pos = 0, row = 0;
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
                result.append("\n" + row + "\nRow:\t" + (i+1) + "\nPosition:\t0\n");
            }
            List<String> words = Arrays.asList(row.split(" "));
            int pos = 0;
            for (int j = 0; j < words.size(); j++) {
                String word = words.get(j);
                if (isPalindrome(word)) {
                    result.append("\n" + word + "\nRow:\t" + (i+1) + "\nPosition:\t" + (pos+1) + "\n");
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
}
