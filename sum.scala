//Question 3


object sum{
def main(args: Array[String]) = {  

find_sum(5);
}



def find_sum(n: Int)={
var total=0;

for(i<-1 to n){ 
total+=i
}
 println(total)
}
}
