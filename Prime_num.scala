
//Question 1



object Prime_num {
   def main(args: Array[String]) {
     
       println(Prime(5))
       println(Prime(8))
      
   }
   def Prime(n: Int): Boolean = {
   
    def PrimeTest(t: Int, isStillPrime: Boolean): Boolean = {
    
      if (!isStillPrime) false
      else if (t <= 1) true
      else PrimeTest(t - 1, n % t != 0 && isStillPrime)
    }

    PrimeTest(n / 2, true)
  }
}
