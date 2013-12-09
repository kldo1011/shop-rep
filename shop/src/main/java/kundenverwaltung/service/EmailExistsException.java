package kundenverwaltung.service;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class EmailExistsException extends AbstractKundeServiceException {
     

	private static final long serialVersionUID = 1230651989631924233L;
		private static final String MESSAGE_KEY = "kunde.emailExists";
        private final String email;
        
        public EmailExistsException(String email) {
                super("Die Email-Adresse " + email + " existiert bereits");
                this.email = email;
        }

        public String getEmail() {
                return email;
        }

        @Override
        public String getMessageKey() {
                return MESSAGE_KEY;
        }
}