package org.acme.resteasy;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@NativeImageTest
public class NativeExampleResourceIT extends ExampleResourceTest {
    // Execute the same tests but in native mode.
    @Test
    public void testHelloEndpoint() {
          given()
          .when().get("/resteasy/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }
}