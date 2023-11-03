package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_register {
    public String valid_endpoint_register = "https://altashop-api.fly.dev/api/auth/register";
    public String invalid_endpoint_register = "https://altashop-api.fly.dev/api/auth/registered";

    @Step("set POST valid endpoint for register")
    public String setPostValidEndpointForRegister(){
        return valid_endpoint_register;
    }

    @Step("send POST HTTP request with valid endpoint for register")
    public void sendPOSTHTTPRequestWithValidEndpointForRegister(){
        int min = 1;
        int max = 1000000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email = "riza" + String.valueOf(number) + "@gmail.com";

        String body = "{\"email\": " + email + ",\n" +
                " \"password\": \"123123\" ,\n" +
                " \"fullname\": \"Riza\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForRegister());
    }

    @Step("received POST HTTP response code 200 for register")
    public void validateHTTPResponseCode200ForRegister(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST invalid endpoint for register")
    public String setPostInvalidEndpointForRegister(){
        return invalid_endpoint_register;
    }

    @Step("send POST HTTP request with invalid endpoint for register")
    public void sendPOSTHTTPRequestWithInvalidEndpointForRegister(){
        String body = "{\"email\": \"kevin@gmail.com\", \"password\": \"kevin123\", \"fullname\": \"Kevin Aprilio\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostInvalidEndpointForRegister());
    }

    @Step("received POST HTTP responses code 404 for register")
    public void validateHTTPResponseCode404WithInvalidEndpointForRegister(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with empty request body for register")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForRegister(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForRegister());
    }

    @Step("received POST HTTP response code 400 for register with empty request body")
    public void validateHTTPResponseCode400ForRegisterWithEmptyRequestBody(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("send POST HTTP request for register")
    public void sendPOSTHTTPRequestForRegister(){
        int min = 1;
        int max = 1000000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email = "nada" + String.valueOf(number) + "@gmail.com";

        String body = "{\"email\": " + email + ",\n" +
                " \"password\": \"123123\" ,\n" +
                " \"fullname\": \"Nada\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForRegister());
    }
}
