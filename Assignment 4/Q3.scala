import scala.io.StdIn.readInt;

object Q3{
    def sum(a: Int): Int = {
        var b: Int = 0;
        if(a > 0){
            b = a + sum(a - 1);
        }
        return b;
    }
    def main(args: Array[String]) = {
        print("Input positive integer: ");
        var n = readInt();
        println(sum(n));
    }
}