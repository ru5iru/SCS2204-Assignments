import scala.io.StdIn.readInt;

object Q1{
    def gcd(a: Int, b: Int): Int = {
        b match{
            case 0 => a;
            case b if b > a => gcd(b, a);
            case _ => gcd(b, a % b);
        }
    }
    def isPrime(x: Int, y: Int = 2): Boolean = {
        y match {
            case y if x == 1 => false;
            case y if x == y => true;
            case y if gcd(x, y) > 1 => false;
            case y => isPrime(x, y+1);
        }
    }

    def main(args: Array[String]) = {
        print("Input positive integer: ");
        var n = readInt();
        print(isPrime(n));
    }
}