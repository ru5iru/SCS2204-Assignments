def easyPace(x: Int): Int = {
    return x * 8;
}

def tempo(x: Int): Int = {
    return x * 7;
}

def main(args: Array[String]) = {
    
    var total = easyPace(2+2)+tempo(3);
    println("Total Time = " + total + " minutes");
}