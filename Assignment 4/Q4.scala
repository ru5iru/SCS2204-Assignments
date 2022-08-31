import scala.io.StdIn.readInt;

object Q4{
    def evenOdd(a: Int): Boolean = {
        if(a == 0){
            return true;
        }else if(a == 1){
            return false;
        }else{
            evenOdd(a-2);
        }
    }
    def main(args: Array[String]) = {
        print("Input positive integer: ");
        var n = readInt();
        if(evenOdd(n)){
            println("Even");
        }else{
            println("Odd");
        }
    }
}