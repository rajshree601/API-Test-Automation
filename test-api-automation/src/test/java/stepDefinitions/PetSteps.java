package stepDefinitions;

import base.BaseTest;
import io.restassured.response.Response;
import pojo.Pet;
import utils.RequestBuilder;
import io.cucumber.java.en.*;

import static org.testng.Assert.*;

public class PetSteps extends BaseTest {

    Response response;
    int petId;
    String name = "Dog_" + System.currentTimeMillis();

    @Given("I create a pet")
    public void createPet() {
        setup();

        petId = (int) (System.currentTimeMillis() % 100000); // 🔥 FIX: ensure unique ID

        Pet pet = new Pet();
        pet.id = petId; // 🔥 IMPORTANT
        pet.name = name;
        pet.status = "available";

        response = RequestBuilder.getRequest()
                .body(pet)
                .post("/pet");

        assertEquals(response.statusCode(), 200);
    }

    @When("I get the pet")
    public void getPet() {
        response = RequestBuilder.getRequest().get("/pet/" + petId);
    }

    @Then("validate pet details")
    public void validatePet() {
        assertEquals(response.jsonPath().getString("name"), name);
        assertEquals(response.statusCode(), 200);
    }

    @When("I update pet status to sold")
    public void updatePet() {
        Pet pet = new Pet();
        pet.id = petId;
        pet.name = name;
        pet.status = "sold";

        response = RequestBuilder.getRequest()
                .body(pet)
                .put("/pet");

        assertEquals(response.statusCode(), 200);
    }

    @Then("I delete the pet")
    public void deletePet() {
        response = RequestBuilder.getRequest().delete("/pet/" + petId);
        assertEquals(response.statusCode(), 200);

        // 🔥 EXTRA VALIDATION (important for assignment)
        Response res = RequestBuilder.getRequest().get("/pet/" + petId);
        assertEquals(res.statusCode(), 404);
    }
}