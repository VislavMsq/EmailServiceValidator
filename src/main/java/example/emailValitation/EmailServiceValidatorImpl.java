package example.emailValitation;

public class EmailServiceValidatorImpl implements EmailServiceValidator {
    private static final String DOG_SYMBOL = "@";

    public boolean validate(String email) {
        return isContainsDog(email);
    }

    private boolean isContainsDog(String email) {
        return email.contains(DOG_SYMBOL);
    }
}
