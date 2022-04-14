import org.scalatest._
import flatspec._
import matchers._

class MultiplesOfThreeOrFiveSpec extends AnyFlatSpec with should.Matchers {

  import MultiplesOfThreeOrFive._

"sumOfMultiples" should "be 266333 for number 1000" in{
sumOfMultiples(1000) shouldBe 266333
}
it should "be 23 for number 10" in{
  sumOfMultiples(10) shouldBe 23
}
}
