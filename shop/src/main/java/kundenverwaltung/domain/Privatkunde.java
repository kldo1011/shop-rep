package kundenverwaltung.domain;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Privatkunde extends AbstractKunde {
       
        
        /**
	 * 
	 */
	private static final long serialVersionUID = -7908724260128715922L;
		private Set<HobbyType> hobbies;

        public Set<HobbyType> getHobbies() {
                return hobbies;
        }
        
        public void setHobbies(Set<HobbyType> hobbies) {
                this.hobbies = hobbies;
        }
        
        @Override
        public String toString() {
                return "Privatkunde [" + super.toString() + ", hobbies=" + hobbies + "]";
        }
}
