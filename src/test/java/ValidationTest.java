import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {
    ValidationUtils validationUtils = new ValidationUtils();
    @Test
    void isValidLengthTest() {
        assertThat(validationUtils.isValidLength("345")).isTrue();
        assertThat(validationUtils.isValidLength("3 5")).isTrue();
        assertThat(validationUtils.isValidLength("32")).isFalse();
        assertThat(validationUtils.isValidLength("")).isFalse();
    }
    @Test
    void isValidRangeTest() {
        assertThat(validationUtils.isValidRange("345")).isTrue();
        assertThat(validationUtils.isValidRange("301")).isFalse();
        assertThat(validationUtils.isValidRange("ABC")).isFalse();
        assertThat(validationUtils.isValidRange(" 3 ")).isFalse();
    }

    @Test
    void isNotDuplicateTest() {
        assertThat(validationUtils.isNotDuplicate("345")).isTrue();
        assertThat(validationUtils.isNotDuplicate("331")).isFalse();
    }

    @Test
    void isValidStringTest() {
        assertThat(validationUtils.isValidString("121")).isFalse();
        assertThat(validationUtils.isValidString("12")).isFalse();
        assertThat(validationUtils.isValidString("abc")).isFalse();
    }

    @Test
    void isValidExitNumberTest() {
        assertThat(validationUtils.isValidExitNumber("1")).isTrue();
        assertThat(validationUtils.isValidExitNumber("2")).isTrue();
        assertThat(validationUtils.isValidExitNumber("3")).isFalse();
        assertThat(validationUtils.isValidExitNumber("a")).isFalse();
        assertThat(validationUtils.isValidExitNumber("")).isFalse();
    }
}
