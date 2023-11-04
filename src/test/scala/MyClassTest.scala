import jdk.internal.vm.vector.VectorSupport.test
import org.scalatest.funsuite.AnyFunSuite

//class MyClassTest extends AnyFunSuite {
//  def test2() {
//    assert(Operations.addition(5, 3) == 2)
//  }
//}
class MyClassTest extends AnyFunSuite {
  test("Checking Addition") {
    val expected = 8
    val actual = Operations.addition(5, 3)
    assert(actual === expected)
    println("Expected:" + expected)
    println("Actual: " + actual)
  }
  test("Checking subtraction") {
    val expected = 2
    val actual = Operations.subtraction(5, 3)
    assert(actual === expected)
    println("Expected:" + expected)
    println("Actual: " + actual)
  }
  test("Checking Multiplication") {
    val expected = 6
    val actual = Operations.multiplication(5, 3)
    assert(actual === expected)
    println("Expected:" + expected)
    println("Actual: " + actual)
  }
  test("Checking Division") {
    val expected = 12
    val actual = Operations.division(50.0, 4.0)
    assert(actual === expected)
    println("Expected:" + expected)
    println("Actual: " + actual)
  }
}

