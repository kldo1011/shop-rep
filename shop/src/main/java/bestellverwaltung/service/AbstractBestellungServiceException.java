package bestellverwaltung.service;

import util.AbstractShopException;


public abstract class AbstractBestellungServiceException extends AbstractShopException {


        public AbstractBestellungServiceException(String msg) {
                super(msg);
        }
        
        public AbstractBestellungServiceException(String msg, Throwable t) {
                super(msg, t);
        }
}