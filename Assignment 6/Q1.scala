class Rational(n:Int, d:Int) {
    require(d > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def neg = new Rational(-this.numer, this.denom)
}

object Q1 extends App{
    val x = new Rational(1,3)
    val result = x.neg;
    println("Negative value of "+x.numer+"/"+x.denom+" = "+result.numer+"/"+result.denom)
}