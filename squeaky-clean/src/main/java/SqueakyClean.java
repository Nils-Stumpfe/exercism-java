import static java.lang.Character.*;

class SqueakyClean {

    static String clean(String text) {
        return convertBlanksToUnderscore(
                                        omitNonAlphaNumericCharacter(
                                        convertLeetSpeak(
                                        convertKebabCaseToCamelCase(text))));
    }

    private static String convertBlanksToUnderscore (String text) {
        return text.replace(' ', '_');
    }

    private static String convertKebabCaseToCamelCase (String text) {
        if (text.contains("-")) {

        String[] stringPart = text.toLowerCase().split("-");
        String returnString = stringPart[0];    
        for (int i = 1; i < stringPart.length; i++) {
            char[] character = stringPart[i].toCharArray();
            character[0] = Character.toUpperCase(character[0]);
            stringPart[i] = new String(character);
            returnString = returnString.concat(stringPart[i]);
        }
        return returnString;
        }

        return text;
    }

    private static String convertLeetSpeak (String text) {
        return text.replace('4', 'a')
                    .replace('3', 'e')
                    .replace('0', 'o')
                    .replace('1', 'l')
                    .replace('7', 't');

    }

    private static String omitNonAlphaNumericCharacter (String text) {
        char[] character = text.toCharArray();   
        for (int i = 0; i < character.length; i++) {
            character[i] = (isLetter(character[i]) || character[i] == ' ') ? character[i] : '#';
        }
        return new String(character).replace("#", "");
    }
}
