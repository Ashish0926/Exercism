import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<Character, Character> map = new HashMap<>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');

        StringBuilder rnaStrand = new StringBuilder();
        for(int i=0; i<dnaStrand.length(); i++) {
            rnaStrand.append(map.get(dnaStrand.charAt(i)));
        }
        return rnaStrand.toString();
    }

}
