package task3;

import java.util.*;
import java.util.stream.Collectors;

public class ManipulationsWithVowels {

    public long countTheNumberOfVowels(String string) {
        Collection<String> collection = Arrays.asList(string.split(""));
        long count = collection.stream()
                .map(n -> n.toLowerCase())
                .filter(c -> c.equals("а") || c.equals("о") || c.equals("ы") || c.equals("э")
                        || c.equals("е") || c.equals("ё") || c.equals("ю") || c.equals("я")
                        || c.equals("и") || c.equals("у"))
                .count();
        return count;
    }



    public List sortByTheNumberOfVowels(String string) {
        Collection<String> collection = Arrays.asList(string.split(" "));
        Map<String, Long> hashMap = new HashMap<>();

        for(String str: collection) {
            hashMap.put(str, countTheNumberOfVowels(str));
        }

        return hashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(s -> s.getKey() /*+ ", "*/)
                .collect(Collectors.toList());
    }



    public String makeTheFirstVowelInTheWordCapital(String string) {
        Collection<String> collection = Arrays.asList(string.split(" "));
        List<String> newList = new ArrayList<>();
        List<String> resaltList = new ArrayList<>();

        for (String str : collection) {
            List<String> list = Arrays.asList(str.split(""));
            int i = 0;
            for(String s : list) {
                if(s.equals("а") || s.equals("о") || s.equals("у") || s.equals("ю") || s.equals("ы") || s.equals("и")
                        || s.equals("э") || s.equals("е") || s.equals("я") || s.equals("ё")) {
                    i++;
                    if(i==1) {
                        s = s.toUpperCase();
                    }
                }
                newList.add(s);
            }
            String resalt = String.join("", newList);
            resaltList.add(resalt);
            newList.clear();
        }
        String st = String.join(" ", resaltList);
        return st;
    }

}
