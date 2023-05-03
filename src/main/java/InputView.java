import java.util.Scanner;

public class InputView {

    public final String START_MSG = "숫자를 입력해 주세요 : ";
    Scanner scanner = new Scanner(System.in);
    public String userInput() {
        printMSG();
        String input = getString();
        stringValidator(input);
        return input;
    }

    private String getString() {
        String input = scanner.nextLine();
        return input;
    }

    private void printMSG() {
        System.out.print(START_MSG);
    }

    public void stringValidator(String input) {
        if (!new ValidationUtils().isValidString(input)) {
            throw new IllegalArgumentException("1-9 사이의 숫자를 입력해 주세요");
        }
    }

}
