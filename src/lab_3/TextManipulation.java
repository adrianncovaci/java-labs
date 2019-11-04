package lab_3;

import java.util.*;

public class TextManipulation {
    public String data;

    public TextManipulation() {
        this.data = "";
    }

    public int getNoOfSentences() {
        return this.data.split("[^?!.]+").length - 1;
    }

    public int getNoOfLetters() {
        int count = 0;
        for (int i = 0; i < this.data.length(); i++) {
            if (Character.isLetter(data.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public int getNoOfVowels() {
        int count = 0;
        String str = this.data;
        str = str.toLowerCase();
        for (int i = 0; i < this.data.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public int getNoOfConsonants() {
        int count = 0;
        String str = this.data;
        str = str.toLowerCase();
        for (int i = 0; i < this.data.length(); i++) {
            Character ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public void showAllWords() {
        String[] words = data.split("([\\W\\s]+)");
        HashMap<String, Integer> values = new HashMap<String, Integer>();
        for (String word : words) {
            if (values.containsKey(word)) {
                values.put(word, values.get(word) + 1);
            } else {
                values.put(word, 1);
            }
        }
        System.out.println("\nToate cuvintele:");
        values.entrySet().forEach(entry -> {
            System.out.print(entry.getKey() + " " + entry.getValue() + "       ");
        });
    }

    public void showFiveMostUsedWords() {
        String[] words = data.split("([\\W\\s]+)");
        HashMap<String, Integer> values = new HashMap<String, Integer>();
        for (String word : words) {
            if (values.containsKey(word)) {
                values.put(word, values.get(word) + 1);
            } else {
                values.put(word, 1);
            }
        }

        if (words.length <= 5) {
            showAllWords();
        } else {
            Map<String, Integer> hm1 = sortByValue(values);
            Set<String> keys = hm1.keySet();
            String[] array = new String[keys.size()];
            int index = 0;
            for (String element : keys) array[index++] = element;

            System.out.println("Top 5 cele mai folosite cuvinte:");
            for (int i = array.length - 1; i > array.length - 6; i--) {
                System.out.print(array[i] + ", ");

            }
        }
    }
}
