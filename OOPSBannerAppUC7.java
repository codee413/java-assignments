import java.util.*;
public class OOPSBannerAppUC7 {
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }

    private static Map<Character, CharacterPatternMap> patternMap = new HashMap<>();
    public static void loadPatterns() {
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));
        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));
        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }
    public static void displayBanner(String word) {
        int height = patternMap.get(word.charAt(0)).getPattern().length;
        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(c);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        loadPatterns();
        String bannerWord = "OOPS";
        displayBanner(bannerWord);
    }
}