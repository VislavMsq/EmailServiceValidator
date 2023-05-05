package example.emailValitation;

public class AdminEmailServiceValidatorImpl extends EmailServiceValidatorImpl implements EmailServiceValidator{

    public static final String OUR_DOMAIN = "test1.com";

    public boolean validate(String email){
        return super.validate(email) && isOurDomain(email);
    }

    private boolean isOurDomain(String email){
        return email.trim().endsWith(OUR_DOMAIN);
    }
}
