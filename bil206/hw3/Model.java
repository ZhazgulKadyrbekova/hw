import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Model {
    private static MainView mainView;
    private String fileName;// = mainView.getFileName();// = "test.txt";
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
//                System.out.println("countChar in case in model");
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
            case "character-asc" :
//                System.out.println("character-asc in case in model");
                mainView.addContent(setContent(Objects.requireNonNull(sort("character", "asc"))));
                break;
            case "character-desc" :
//                System.out.println("character-desc in case in model");
                mainView.addContent(setContent(Objects.requireNonNull(sort("character", "desc"))));
                break;
            case "frequency-asc" :
//                System.out.println("frequency-asc in case in model");
                mainView.addContent(setContent(Objects.requireNonNull(sort("frequency", "asc"))));
                break;
            case "frequency-desc" :
//                System.out.println("frequency-desc in case in model");
                mainView.addContent(setContent(Objects.requireNonNull(sort("frequency", "desc"))));
                break;
            case "word-asc" :
//                System.out.println("word-asc in case in model");
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word", "asc"))));
                break;
            case "word-desc" :
//                System.out.println("word-asc in case in model");
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word", "desc"))));
                break;
            case "word-frequency-asc" :
//                System.out.println("frequency-asc in case in model");
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word-frequency", "asc"))));
                break;
            case "word-frequency-desc" :
//                System.out.println("frequency-desc in case in model");
                mainView.addContent(setWordContent(Objects.requireNonNull(sortWords("word-frequency", "desc"))));
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
            }
            reader.close();
        } catch (FileNotFoundException e) {
//            System.out.println(text);
//            System.out.println(fileName);
            System.out.println("Error! File not found");
            e.printStackTrace();
        }
//        System.out.println(text);
//        System.out.println(fileName);
    }

    private void setTotalChars() {
        int length = text.length();
        mainView.setTotalChars(length);
//        System.out.println(text);
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
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }
    }

    private void setWordsMap() {
        wordsMap = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
    }

    private String setContent(Map<Character, Integer> newMap) {
        String result = "Space [ ] is noted with underscore [_] \n";
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
//                    System.out.println(orderedMap.toString());
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

}
