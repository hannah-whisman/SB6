
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {


    public static String findTYPattern(String s) {
        StringBuilder result = new StringBuilder();
        boolean foundT = false;

        for (char c : s.toCharArray()) {
            if ((c == 't' || c == 'T') && !foundT) {
                foundT = true;
                result.append(c);
            } else if (foundT) {
                result.append(c);
                if (c == 'y' || c == 'Y') {
                    return result.toString();
                }
            }
        }

        return "";
    }
}
