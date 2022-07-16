var Pi = 3.14;

def volume(x: Double) : Double = {
    return 4 / 3 * Pi * x * x * x;
}

def main(args: Array[String]) = {
    
    println("Volume = " +volume(5));
}