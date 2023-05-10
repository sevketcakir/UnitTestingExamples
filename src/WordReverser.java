// "this is a test with junit test framework" -> "siht si a tset htiw tinuj tset krowemarf"
public class WordReverser {
    public String reverse(String string) {
        
        String[] splitted = string.split(" ");
        String[] result = new String[splitted.length];
        for (int i = 0; i < splitted.length; i++) {
            String word = splitted[i];
            StringBuilder temp = new StringBuilder();
            temp.append(word);
            temp.reverse();
            result[i] = temp.toString();
        }
        return String.join(" ", result);
    }
}
