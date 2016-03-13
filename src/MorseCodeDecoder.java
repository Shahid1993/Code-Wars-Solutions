import java.util.Map;

/**
 * Created by ajinkya on 13/03/16.
 */
public class MorseCodeDecoder {
    private static Map<Object,Object> MorseCode;

    public static String decode(String morseCode) {
        String line = "";
        String tmp = "";
        for (int i = 0; i < morseCode.length(); ) {
            if (morseCode.charAt(i) == ' ' && morseCode.charAt(i + 1) == ' ') {
                i = i + 3;
                line = line + MorseCode.get(tmp) + " ";
                tmp = "";
            } else if (morseCode.charAt(i) == ' ') {
                line = line + MorseCode.get(tmp);
                tmp = "";
                i++;
            } else {
                tmp = tmp + morseCode.charAt(i);
                i++;
                if (i == morseCode.length())
                    line = line + MorseCode.get(tmp);
            }
        }
        return line;
    }
}
