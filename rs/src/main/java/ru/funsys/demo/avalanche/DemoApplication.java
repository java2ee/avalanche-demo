/**
 * Функциональные системы
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ru.funsys.avalanche.Application;

/**
 * Класс реализации REST сервиса - получение информации об операционной системе
 
 * @author Валерий Лиховских
 *
 */
@Path("/json")
public class DemoApplication extends Application {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2098562113534946778L;

	/**
	 * Определение поля для хранения экземпляра адаптера
	 */
	private DemoAdapter info;

	/**
	 * Получить информацию об операционной системе
	 * @return json ввиде {"os.version": "10.0","PID@name":"23060@likhovskikh-vv","os.name":"Windows 10"}
	 *         или  {"error":"Соообщение об ощибке"}
	 */
	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInfo() {
		Hashtable<String, String> result;
		Response response;
		try {
			result = application.info.getInfo();
			response = Response.ok(result).type(MediaType.APPLICATION_JSON_TYPE.withCharset("UTF8")).build();
		} catch (Exception e) {
			result = new Hashtable<String, String>();
			result.put("error", e.toString());
			Response.serverError().type(MediaType.APPLICATION_JSON_TYPE.withCharset("UTF8")).entity(result).build();
		}
		return response;
	}
	
}
