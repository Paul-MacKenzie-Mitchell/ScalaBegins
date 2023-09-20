//def identity(x:Int): Int = x
//
//
//    def sum(f: Int => Int): (Int, Int) => Int ={
//      def sumF(a: Int, b: Int): Int = {
//        if ( a > b) 0
//        else f(a) +sumF(a + 1, b)
//      }
//      sumF
//    }
//
//    def product (f: Int => Int)(a: Int, b: Int): Int = {
//      if (a > b) 1 else f(a) * product(f)(a+1,b)
//    }
//
//    product(x => x * x)(1, 5)
//
//    def fact(n: Int) = product(x => x)(1, n)
//
//    fact(5)
//
//    def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
//      def recur(a: Int): Int =
//        if (a > b) zero
//        else combine(f(a), recur(a + 1))
//      recur(a)
//    }
//
//    def sumMapReduce(f: Int => Int) = mapReduce(f, (x, y) => x + y, 0)
//    def productMapReduce(f: Int => Int) = mapReduce(f, (x, y) => x * y, 1)
//
//    productMapReduce(identity)(1, 10)
//    sumMapReduce(fact)( 1, 5)
