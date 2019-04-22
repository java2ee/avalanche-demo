/**
 * 
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;

import javax.inject.Singleton;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Валерий Лиховских
 *
 */
@Path("json")
public class DemoService {
	
	private DemoApplication application;
	
	public void setApplication(DemoApplication application) {
		this.application = application;
	}

	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInfo() {
		Hashtable<String, String> result;
		try {
			result = application.info.getInfo();
		} catch (Exception e) {
			result = new Hashtable<String, String>();
			result.put("error", e.toString());
		}
		return Response.ok(result).type(MediaType.APPLICATION_JSON_TYPE.withCharset("UTF8")).build();
	}
	
}
