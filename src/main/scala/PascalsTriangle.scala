object PascalsTriangle {

  def pascalsTriangle(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascalsTriangle((c - 1), (r - 1)) + pascalsTriangle(c, (r - 1))
  }

  def balance(list: List[Char]): Boolean = {
    def go(chars: List[Char], count: Int): Int = {
      if(chars.isEmpty) count
      else if (count < 0) count
      else if (chars.head == ')') go(chars.tail, count -1)
      else if (chars.head == '(') go(chars.tail, count + 1)
      else go(chars.tail, count)
    }
    go(list, 0) == 0
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    def ways(money: Int, coins: List[Int], changeTypes: Int): Int = {
      if (money == 0) 1
      else if (money < 0) 0
      else if (changeTypes <= 0) 0
      else ways(money, coins, changeTypes - 1) + ways(money - coins(changeTypes - 1 ), coins, changeTypes)
    }
    ways(money, coins, coins.length)
  }
  def main(args: Array[String]): Unit = {
    println(pascalsTriangle(2, 4))
    val lst = "())(".toList
    println(balance(lst))
    val coins: List[Int] = List(1,2)
    println(countChange(4, coins))
  }

}
