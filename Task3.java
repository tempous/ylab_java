    /*
    Task3

        Реализовать функцию нечеткого поиска

            fuzzySearch("car", "ca6$$#_rtwheel"); // true
            fuzzySearch("cwhl", "cartwheel"); // true
            fuzzySearch("cwhee", "cartwheel"); // true
            fuzzySearch("cartwheel", "cartwheel"); // true
            fuzzySearch("cwheeel", "cartwheel"); // false
            fuzzySearch("lw", "cartwheel"); // false
    */

public class Task3 {
    static void fuzzySearch(String pattern, String line)
    {
        int patternLength = pattern.length(), lineLength = line.length();
        int patternIndex = 0, lineIndex = 0;

        while (patternIndex < patternLength && lineIndex < lineLength)
        {
            if (pattern.charAt(patternIndex) == line.charAt(lineIndex))
                patternIndex++;
            lineIndex++;
        }

        System.out.println(patternIndex == patternLength);
    }

    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }
}