#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.annotations.GZIP;
import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

import com.wordnik.swagger.annotations.Api;

@GZIP
@Api(value = "greeting", description = "Greeting API", position = 7)
@Path("greeting")
@CrossOriginResourceSharing(allowAllOrigins = true)
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return "Hello World!";
    }

}