import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    // florian-zeidler's solution
    // https://exercism.org/tracks/java/exercises/gotta-snatch-em-all/solutions/florian-zeidler
    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    // looked at 010101-sans's solution
    // https://exercism.org/tracks/java/exercises/gotta-snatch-em-all/solutions/010101-sans
    // could be further improved but I refuse to implement shit i cant understand. 
    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();

        common.addAll(collections.get(0));
        collections.forEach(common::retainAll);

        return common;
    }

    // could be improved but I refuse to implement shit i cant understand. 
    static Set<String> allCards(List<Set<String>> collections) {

        Set<String> allcard = new HashSet<>();

        for (Set<String> set : collections) {
            for (String card : set) {
                allcard.add(card);
            }
        }

        return allcard;
        
    }
}
