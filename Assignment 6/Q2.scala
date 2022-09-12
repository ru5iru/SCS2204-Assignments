class Rational(n:Int, d:Int) {
    require(d > 0, "Denominator must be greater than 0")
    private def gcd(x:Int, y:Int):Int = if(y == 0) x else gcd(y, x % y)
    def numer = n / gcd(n, d)
    def denom = d / gcd(n, d)

    def neg = new Rational(-this.numer, this.denom)
    def +(r: Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, this.denom*r.denom)
    def -(r: Rational) = this + r.neg
}

object Q2 extends App{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)

    val result = x - y - z
    println(x.numer+"/"+x.denom+" - "+y.numer+"/"+y.denom+" - "+z.numer+"/"+z.denom+" = "+result.numer+"/"+result.denom)
}