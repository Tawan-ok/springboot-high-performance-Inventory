import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ProductLoadTest extends Simulation {
  val httpProtocol = http.baseUrl("http://localhost:8080")

  val scn = scenario("Get Products")
    .exec(http("Get All Products API")
      .get("/api/products")
      .check(status.is(200)))
    .pause(1)

  setUp(scn.inject(atOnceUsers(1000)).protocols(httpProtocol))
}
