package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.message.EmailType;
import com.sahabt.library.domain.message.Message;
import com.sahabt.library.domain.user.Email;

public class MessageTest {

	@Test
	void test() {

		var email= Email.of("buyuksaat@example.com", EmailType.PERSONAL);
		var turgutUyar = new Message.Builder() 
				.identityNo("00000000001")
				.email(email)
				.messageContent("Bir bozuk saattir y�re�im, hep sende durur")
				.build();  
		System.out.println(turgutUyar.getEmail().toString());

		assertEquals("00000000001",turgutUyar.getIdentityNo().getIdentityNo() );
		assertEquals("buyuksaat@example.com", turgutUyar.getEmail().getEmail());
		assertEquals("PERSONAL", turgutUyar.getEmail().getEmailType());
		assertEquals("Bir bozuk saattir y�re�im, hep sende durur", 
					turgutUyar.getMessageContent().getMessageContent());

	}

}