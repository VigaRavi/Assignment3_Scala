//Question 2



object primenos{


def main(args: Array[String]) :Unit= {  
    
print("Enter the value of n:");
val n=scala.io.StdIn.readInt();
println("All prime nos less than "+n+":");
primeseq(n-1);
}

def prime(n:Int , i:Int):Boolean=
{
    if(i==1) true
    else if(n%i==0) false 
    else prime(n,i-1)
}
def primeseq(n:Int): Unit =
{
    if(prime(n,n/2)) 
    println(n)
    if(n>0) primeseq(n-1)
}

}
