 object Currying {

   // Currying is the technique of transforming a function
   // that takes multiple arguments int a function that takes a single argument

   def add(x: Int, y: Int): Int = x + y

   def add2(x: Int) = (y: Int) => x +y //curryd function

   def add3 (x : Int) (y: Int) = x + y //simpler curryd function

   def sum(f: Int => Int): (Int, Int) => Int = {
     def sumF(a: Int, b: Int): Int = {
       if (a > b) 0
       else f(a) + sumF(a + 1, b)
     }
     sumF
   }

   //above equivalent to below

   def sum2(f: Int => Int)(a: Int, b: Int): Int = {
     if (a > b) 0 else f(a) + sum2(f)(a + 1, b)
   }

   def main(args: Array[String]): Unit = {
      println(add(20,10))
     println(add2(20)(10))
     val sum40 = add2(40)
     println(sum40(100))
     println(add3(100)(200))
     val sum50 = add3(50)_  //use the wild card '_' as the second argument
     println(sum50(50))
     println(sum2(x => x *x)(1, 5)) //1, 4, 9, 16, 25
     println(1 + 4 + 9 + 16 + 25)
   }
}
