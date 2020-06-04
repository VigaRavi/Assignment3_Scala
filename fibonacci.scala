//Question 6


object fibonacci {
   def main(args: Array[String]) {
     

println(fibSeq(9));




}
def fibSeq(n: Int): List[Int] = {
    var ret = scala.collection.mutable.ListBuffer[Int](1, 2)
    while (ret(ret.length - 1) < n) {
      val temp = ret(ret.length - 1) + ret(ret.length - 2)
      if (temp >= n) {
        return ret.toList
      }
      ret += temp
    }
    ret.toList
  }

}
