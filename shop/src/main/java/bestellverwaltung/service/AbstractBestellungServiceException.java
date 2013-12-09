package bestellverwaltung.service;

import util.AbstractShopException;


public abstract class AbstractBestellungServiceException extends AbstractShopException {


	private static final long serialVersionUID = 3928551753228130101L;

		public AbstractBestellungServiceException(String msg) {
                super(msg);
        }
        
        public AbstractBestellungServiceException(String msg, Throwable t) {
                super(msg, t);
        }
} 