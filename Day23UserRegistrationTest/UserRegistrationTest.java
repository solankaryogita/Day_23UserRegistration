package Day23UserRegistrationTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import Day23UserRegistration.InvalidUserException;
import Day23UserRegistration.UserRegistration;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void firstNameShouldReturnTrue() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "Dolly", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
	}

	@Test
	public void firstNameShouldReturnFalse() {
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(InvalidUserException.class);
			result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "Max", "Happy");
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
		assertTrue(result);
}
}