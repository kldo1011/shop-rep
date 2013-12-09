package kundenverwaltung.service;

import util.AbstractShopException;

public abstract class AbstractKundeServiceException extends AbstractShopException {


	private static final long serialVersionUID = -6808825398467876572L;

		public AbstractKundeServiceException(String msg) {
                super(msg);
        }
        
        public AbstractKundeServiceException(String msg, Throwable t) {
                super(msg, t);
        }
}
