import scala.io.StdIn.readInt

object Q2{
    def patternMatching(value: Int): String = {
        value match {
            case value if value <= 0 => "Negative/Zero";
            case value if value % 2 == 0 => "Even";
            case _ => "Odd";
        }
    }

    def main(args: Array[String]) = {
        print("Input Value: ");
        var x = readInt();
        println(patternMatching(x));
    }
}