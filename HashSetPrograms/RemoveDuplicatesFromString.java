import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "seleniumautomation";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(char ch : str.toCharArray()) {
            set.add(ch);
        }
        
        // Use StringBuilder to collect the characters back into a String
        StringBuilder sb = new StringBuilder();
        for(char m : set) {
            sb.append(m);
        }
        
        String result = sb.toString();
        System.out.println("Resulting String: " + result);
    }
}