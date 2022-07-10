object q4a {
    
    def normalPay(x:Int) : Int = {
        return  x * 250;
    }

    def otPay(x:Int) : Int = {
        return x * 85;
    }

    def tax(x:Int, y:Int) : Float = {
        return (normalPay(x) + otPay(y)) * 12 / 100;
    }

    def salary(nHours: Int, otHours: Int) : Float = {
        return normalPay(nHours) + otPay(otHours) - tax(nHours, otHours);
    }

    def main(args: Array[String]) = {
        println("Take Home Salary = Rs. " +salary(40, 30));
    }
}