package kunde.rest;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import kundenverwaltung.service.KundeDeleteBestellungException;
import util.interceptor.Log;
import util.rest.Messages;


@Provider
@Log
public class KundeDeletBestellungExceptionMapper implements ExceptionMapper<KundeDeleteBestellungException> {
        @Context
        private HttpHeaders headers;
        
        @Inject
        private Messages messages;
        
        @Override
        public Response toResponse(KundeDeleteBestellungException e) {
                final String msg = messages.getMessage(headers, e.getMessageKey(), e.getKundeId(), e.getAnzahlBestellungen());
                return Response.status(BAD_REQUEST)
                               .type(TEXT_PLAIN)
                               .entity(msg)
                               .build();
        }
}
