import scala.io.StdIn.readDouble;

object Q1{
    var rate_1: Double = 0.02;
    var rate_2: Double = 0.035;
    var rate_3: Double = 0.04;
    var rate_4: Double = 0.065;

    def interest(amount: Double): Double = {
        amount match{
            case amount if amount < 20000.00 => amount * rate_1;
            case amount if amount < 200000.00 => amount * rate_2;
            case amount if amount < 2000000.00 => amount * rate_3;
            case amount if amount >= 2000000.00 => amount * rate_4;
        }
    }

    def main(args: Array[String]) = {
        print("\nInput Amount: ");
        var x = readDouble();
        printf("\nInterest for  Rs.%.2f = Rs.%.2f\n", x, interest(x));
    }
}