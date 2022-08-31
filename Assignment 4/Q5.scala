import scala.io.StdIn.readInt;

object Q3{
    def sum(a: Int, b: Int = 0): Int = {
        if(b > a){
            return 0;
        }
        return b + sum(a, b+2);
    }
    def main(args: Array[String]) = {
        print("Input positive integer: ");
        var n = readInt();
        println(sum(n));
    }
}