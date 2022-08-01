object Q3{
    def toUpper(s: String): String = {
        s.toUpperCase();
    }

    def toLower(s: String): String = {
        s.toLowerCase();
    }

    def formatNames(name: String)(func: String => String): String = {
        func(name);
    }

    def main(args: Array[String]) = {
        var p = "Benny";
        var q = "Niroshan";
        var r = "Saman";
        var s = "Kumara";

        var w = formatNames(p)(toUpper(_));
        var x = formatNames(q.substring(0,2))(toUpper(_)) + formatNames(q.substring(2))(toLower(_));
        var y = formatNames(r)(toLower(_));
        var z = formatNames(s.substring(0,1))(toUpper(_)) + formatNames(s.substring(1,5))(toLower(_)) + formatNames(s.substring(5))(toUpper(_));

        print(s"$w \n$x \n$y \n$z \n");
    }
}