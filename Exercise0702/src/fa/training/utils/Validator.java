package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String VALID_EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]" + "+\\.[a-zA-Z]{2,6}$";

	/**
	 * Check email address is valid.
	 * 
	 * @param emailAddress
	 * @return true, if valid, otherwise return false.
	 */
	public static boolean isEmail(String emailAddress) {
		Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);
		Matcher matcher = pattern.matcher(emailAddress);
		return matcher.matches();
	}

	/**
	 * Check gender value is valid.
	 * 
	 * @param gender
	 * @return true, if valid, otherwise return false.
	 */
	public static boolean isGender(byte gender) {
		if ((gender == 1) || (gender == 0)) {
			return true;
		}
		return false;
	}
}
