package at.gv.egiz.mgovernment.android.mobilephonesignatureconnector.exceptions;

/**
 * 
 * @author Sandra Kreuzhuber
 * @author Thomas Zefferer
 * 
 */

public class PasswordMissingOrTooShortException extends Exception {

	private static final long serialVersionUID = 1L;

	public PasswordMissingOrTooShortException(String msg) {
		super(msg);
	}
}
