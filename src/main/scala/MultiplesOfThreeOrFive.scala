object MultiplesOfThreeOrFive extends App {

  def sumOfMultiples(n: Int): Int = {
    var sum5 = 0
    var sum3 = 0
    val mult3 = List.range(1,n).filter(n => n%3 == 0).foreach(sum3 += _)
    val mult5 = List.range(1,n).filter(n => n%5 == 0).foreach(sum5 += _)
    sum5 + sum3
  }
}
