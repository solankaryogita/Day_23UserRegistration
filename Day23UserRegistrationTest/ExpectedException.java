package Day23UserRegistrationTest;

import Day23UserRegistration.InvalidUserException;

public class ExpectedException {

	 public static ExpectedException none() {
  	   return null;
     }
     
     public void expect(Class<InvalidUserException> invalidUserExceptionClass) {
  	   
     }
}
