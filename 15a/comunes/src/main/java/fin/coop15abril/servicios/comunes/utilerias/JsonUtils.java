package fin.coop15abril.servicios.comunes.utilerias;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;

public class JsonUtils {

	// private static Logger log = LoggerFactory.getLogger(JsonUtils.class);

	private JsonUtils() {
		throw new IllegalStateException("Utility JSON class");
	}

	public static <T> T jsonToClass(String data, Class<T> clase) throws ExcepcionApp {
		try {
			return new Gson().fromJson(data, clase);
		} catch (Exception e) {
			// e.printStackTrace();
			// return null;
			// log.error(e.getMessage());
			throw new ExcepcionApp("500", "Error en el Json recibido", e.getMessage());
		}
	}

	public static <T> String classToJson(T objecto) throws ExcepcionApp {
		try {
			return new Gson().toJson(objecto);
		} catch (Exception e) {
			// log.error(e.getMessage());
			throw new ExcepcionApp("500", "Error al convertir Json", e.getMessage());
		}
	}

}
