import java.util.Arrays;
import java.util.regex.Pattern;

public class ValidationUtils {
    public boolean isValidLength(String input) {
        return input.length() == 3;
    }

    public boolean isValidRange(String input) {
        Pattern pattern = Pattern.compile("^[" + 1 + "-" + 9 + "]*$");
        return pattern.matcher(input).matches();
    }

    public boolean isNotDuplicate(String input) {
        return Arrays.stream(input.split(""))
                .distinct()
                .count() == 3;
    }

    public boolean isValidString(String input) {
        return isNotDuplicate(input) && isValidRange(input) && isValidLength(input);
    }

    public boolean isValidExitNumber(String input) {
        Pattern pattern = Pattern.compile("^[" + 1  + "-" + 2 + "]*$");
        return pattern.matcher(input).matches() && !input.equals("");
    }
}
