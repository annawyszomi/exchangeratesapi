import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.io.IOException;

public class MyStepdefs{
    RequestDefinition requestDefinition;
    int result;

    @Given("Create API call")
    public void createAPICall() {
        requestDefinition = new RequestDefinition();
    }

    @When("Execute API call url: {string} apikey: {string}")
    public void executeAPICallUrlApikey(String url, String apikey) throws IOException {
        result = requestDefinition.sendRequest(url,apikey);
    }

    @Then("Get {int} code status")
    public void getCodeStatus(int statusCode) {
        Assert.assertEquals(statusCode,result);

    }
}
