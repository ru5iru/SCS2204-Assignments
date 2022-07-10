object q3{
    def main(args: Array[String]) = {
        var (a, b, c, d) = (2, 3, 4, 5);
        var k: Float = 4.3f;

        //println( - -b * a + c *d - -);     //error
        b -= 1;
        println("(a) " +(b*a+c*d));        //24
        d -= 1;

        //println(a++);                    //error
        println("(b) " +(a));              //2
        a += 1;

        //println (–2 * ( g – k ) +c);     //error

        //println (c=c++);                 //error
        println("(d) " +(c));              //4

        //println (c=++c*a++);             //error
        c += 1;
        c *= a;
        a += 1;
        println("(e) " +(c));              //15

    }
}