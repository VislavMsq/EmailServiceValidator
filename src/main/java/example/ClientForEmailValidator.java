package example;

import example.emailValitation.AdminEmailServiceValidatorImpl;
import example.emailValitation.EmailServiceValidatorImpl;

public class ClientForEmailValidator {

    EmailServiceValidatorImpl emailServiceValidator;

    public ClientForEmailValidator(EmailServiceValidatorImpl emailServiceValidator) {
        this.emailServiceValidator = emailServiceValidator;
    }

    public static void main(String[] args) {
        ClientForEmailValidator client = new ClientForEmailValidator(new EmailServiceValidatorImpl());

        System.out.println("test@email.com = " + client.emailServiceValidator.validate("test@email.com"));
        System.out.println("test@email.com = " + client.emailServiceValidator.validate("test_email.com"));

        System.out.println();
        ClientForEmailValidator client1 = new ClientForEmailValidator(new AdminEmailServiceValidatorImpl());

        System.out.println("test@email.com = " + client1.emailServiceValidator.validate("test@email.com"));
        System.out.println("test@email.com = " + client1.emailServiceValidator.validate("test_email.com"));
        System.out.println("test@test1.com = " + client1.emailServiceValidator.validate("test@test1.com"));

    }
}
