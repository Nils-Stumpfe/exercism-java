import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();
    private final String[] excitinglanguages = {"Java", "Kotlin"};

    public boolean isEmpty() {
       return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        while (languages.remove(language)) {}
    }

    public String firstLanguage() {
       return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
       return languages.contains(language);
    }

    public boolean isExciting() {
        for (String language : languages) {
            for (String element : excitinglanguages) {
                if (language.equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }
}
