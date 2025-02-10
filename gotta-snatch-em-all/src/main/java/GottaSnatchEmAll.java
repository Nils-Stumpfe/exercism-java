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

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> temp = new HashSet<>(myCollection);
        myCollection.removeAll(theirCollection);
        theirCollection.removeAll(temp);
        return (myCollection.isEmpty() || theirCollection.isEmpty()) ? false : true;
    }

    // looked at 010101-sans's solution
    // https://exercism.org/tracks/java/exercises/gotta-snatch-em-all/solutions/010101-sans
    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();

        common.addAll(collections.get(0));
        collections.forEach(common::retainAll);

        return common;
    }


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
