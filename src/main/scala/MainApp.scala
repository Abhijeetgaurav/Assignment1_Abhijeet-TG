object MainApp {
  def main(args:Array[String]): Unit={
    println("All four mathematical op")

    println("addition : " + Operations.addition(10,20))
    println("Subtraction : " + Operations.subtraction(100,20))
    println("Multiplication : " + Operations.multiplication(10,20))
    println("Division : " + Operations.division(50.0,4.0))
  }
}
