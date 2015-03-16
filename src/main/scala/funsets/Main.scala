package funsets

object Main extends App {
  import FunSets._
  val s0 = singletonSet(-10)
  val s1 = singletonSet(3)
  val s2 = singletonSet(7)
  val s3 = singletonSet(9)
  val s4 = union(s1,s2) // { 3, 9 }
  
  val s5  = union(s0,s4)
     
  val s6 = map(s5, x => x*2)
  printSet(s6)


}
