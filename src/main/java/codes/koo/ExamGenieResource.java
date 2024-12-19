package codes.koo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class ExamGenieResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hi, ExamGenie is working";
    }

    @GET
    @Path("/classes")
    @Produces(MediaType.TEXT_PLAIN)
    public String classes() {
        return "[Collection of classes placeholder]";
    }

    @GET
    @Path("/weeks")
    @Produces(MediaType.TEXT_PLAIN)
    public String weeks() {
        return "[Collection of weeks placeholder]";
    }

    @GET
    @Path("/tags")
    @Produces(MediaType.TEXT_PLAIN)
    public String tags() {
        return "[Collection of tags placeholder]";
    }

    @POST
    @Path("/questions")
    @Produces(MediaType.TEXT_PLAIN)
    public String questions() {
        return "[Collection of questions placeholder]";
    }

    @POST
    @Path("/upload")
    @Produces(MediaType.TEXT_PLAIN)
    public String upload() {
        return "[Collection of upload placeholder]";
    }

    @POST
    @Path("/sow")
    @Produces(MediaType.TEXT_PLAIN)
    public String sow() {
        return "[Collection of sow placeholder]";
    }
}
