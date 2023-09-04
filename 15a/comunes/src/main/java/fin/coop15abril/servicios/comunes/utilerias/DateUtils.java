package fin.coop15abril.servicios.comunes.utilerias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtils {

	private static Logger log = LoggerFactory.getLogger(DateUtils.class);

	private DateUtils() {
		throw new IllegalStateException("Utility DateUtils class");
	}

	public static <T> String fechaToString(T fecha) {
		if (fecha == null)
			return null;
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			if (fecha instanceof XMLGregorianCalendar) {
				return df.format(((XMLGregorianCalendar) fecha).toGregorianCalendar().getTime());
			} else {
				return df.format(fecha);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}

	}
}
