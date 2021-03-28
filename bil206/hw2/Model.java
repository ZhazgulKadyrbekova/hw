import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Model {
    private static MainView mainView;
    private String fileName;
    private static String text;
    private static Map<Character, Integer> map;

    public Model(MainView view) {
        mainView = view;
    }

    protected void doAction(String command) {
        this.fileName = mainView.getFileName();
        this.readFile();
        this.setTotalChars();
        this.setTotalCharsWithoutSpace();
        this.setMap();

        switch (command) {
            case "countChar" :
                mainView.countChars();
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

    private String setContent(Map<Character, Integer> newMap) {
        String result = "Space [ ] is noted with underscore [_] \n";
        for (Map.Entry<Character, Integer> item : newMap.entrySet()) {
            String itemValue;
            if (item.getKey() == ' ')
                itemValue = "_ -> " + item.getValue() + "\n";
            else
                itemValue = item.getKey() + " -> " + item.getValue() + "\n";
            result += itemValue;
        }
        return result;

    }

    private Map<Character, Integer> sort(String filter, String way) {
        if (filter.equals("character")) {
            Map<Character, Integer> treeMap = new TreeMap<>(map);
            if (way.equals("asc")) {
                return treeMap;
            } else if (way.equals("desc")) {
                Map<Character, Integer> orderedMap = new TreeMap(Collections.reverseOrder());
                orderedMap.putAll(treeMap);
                return orderedMap;
            }
        } else if (filter.equals("frequency")) {
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());
            Map<Character, Integer> result = new LinkedHashMap<>();
            if (way.equals("asc")) {
                for (Map.Entry<Character, Integer> entry : list) {
                    result.put(entry.getKey(), entry.getValue());
                }
                return result;
            } else if (way.equals("desc")) {
                Collections.reverse(list);
                for (Map.Entry<Character, Integer> entry : list) {
                    result.put(entry.getKey(), entry.getValue());
                }
                return result;
            }
        }
        return null;
    }

}
