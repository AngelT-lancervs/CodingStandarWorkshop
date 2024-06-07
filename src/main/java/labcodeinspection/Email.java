package labcodeinspection;

import java.io.Serializable;
import java.util.Locale;

/**
 * This class represents an email account.
 */
public class Email implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The first name of the email owner */
    private final String firstName;

    /** The last name of the email owner */
    private final String lastName;

    /** The password for the email account */
    private String password;

    /** The department of the email owner */
    private String department;

    /** The default length for the generated password */
    private static final int passwordLength = 8;

    /** The generated email address */
    private String emailGenerate;

    /**
     * Constructs a new Email instance.
     *
     * @param firstName the first name of the email owner
     * @param lastName the last name of the email owner
     */
    public Email(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Displays the email information.
     */
    public void showInfo() {
        System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
        System.out.println("DEPARTMENT= " + department + "\nEMAIL= " + emailGenerate + "\nPASSWORD= " + password);
    }

    /**
     * Sets the department based on the given choice.
     *
     * @param depChoice the department choice (1 for sales, 2 for dev, 3 for acct)
     */
    public void setDepartment(final int depChoice) {
        switch (depChoice) {
            case 1:
                this.department = "sales";
                break;
            case 2:
                this.department = "dev";
                break;
            case 3:
                this.department = "acct";
                break;
            default:
                this.department = "";
                break;
        }
    }

    /**
     * Generates a random password of the default length.
     *
     * @return the generated password
     */
    private String randomPassword() {
        final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
        final char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            final int rand = (int) (Math.random() * set.length());
            password[i] = set.charAt(rand);
        }
        return new String(password);
    }

    /**
     * Generates an email address and a random password for the email account.
     */
    public void generateEmail() {
        this.password = this.randomPassword();
        this.emailGenerate = this.firstName.toLowerCase(Locale.ROOT) + this.lastName.toLowerCase(Locale.ROOT) + "@" + this.department
                + ".espol.edu.ec";
    }
}

