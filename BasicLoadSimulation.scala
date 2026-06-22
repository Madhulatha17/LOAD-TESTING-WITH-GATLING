import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicLoadSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://reqres.in")
    .acceptHeader("application/json")

  val scn = scenario("Load Test API")
    .exec(
      http("Get Users")
        .get("/api/users?page=1")
        .check(status.is(200))
    )

  setUp(
    scn.inject(
      rampUsers(100).during(30.seconds)
    )
  ).protocols(httpProtocol)

}
