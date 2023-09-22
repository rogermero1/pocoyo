package fin.coop15abril.servicios.denarius.configuracion;

import java.io.IOException;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import feign.Response;
import feign.codec.ErrorDecoder;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;

public class ControlErrorClienteFeing implements ErrorDecoder {

	@SuppressWarnings("deprecation")
	@Override
	public ExcepcionApp decode(String methodKey, Response response) {
		String mensajeTecnico = null;
		String url = null;
		try {
			mensajeTecnico = IOUtils.toString(response.body().asInputStream(), Charsets.UTF_8);
			url=response.request().url();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		switch (response.status()) {
//		case 400:
//			return new Exception("Exception 400");
//		case 500:
//			return new Exception("Exception 500");
//		default:
//			return new Exception("Exception OTRA");
//		}
		return new ExcepcionApp("500", "Error al conectar " + url + " HTTP:" + response.status(), mensajeTecnico);
	}

}
