package funsets

object Main extends App {
  import FunSets._
  val s0 = singletonSet(-10)
  val s1 = singletonSet(3)
  val s2 = singletonSet(7)
  val s3 = singletonSet(9)
  val s4 = union(s1,s2) // { 3, 9 }
  
  val s5  = union(s0,s4)
  
     
  printSet(s5)
  
  println("1. (x > -9) forall -> false == " + forall(s5, x => x > -9))   
  println("2. (x > -11) forall -> true == " + forall(s5, x => x > -11))
  println("3. (x % 3 = 0) forall -> false == " + forall(s5, x => (x % 3) == 0))

}
