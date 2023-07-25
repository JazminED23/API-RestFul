package controllers;

import com.models.User;
import com.services.UserService;
import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/users")
public class UserController {
    @Inject
    private UserService userService;
    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAll(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for (User user: userService.getAll()){
            builder.add(Json.createObjectBuilder().add("email",user.getEmail()));
        }
        return builder.build();
    }
}
