//Question 5

object even_sum{
def main(args: Array[String]) = {  

find_sum(15);
}



def find_sum(n: Int)={
var total=0;

for(i<-1 to n if i%2==0){ 
total+=i
}
 println(total)
}
}
