var b_Price = 24.95;
var discount = 0.4;
var ship = 3;
var adShip = 0.75;

def totalCost(count: Int): Double = {
    
    def discountedPrice(x: Double): Double = {
        return count * b_Price * (1 - discount);
    }

    def shippingCost(count: Int): Double = {
        if (count > 50){
            return ship * 50 + adShip * (count - 50);
        }else{
            return ship * count;
        }
    }

    return discountedPrice(count) + shippingCost(count);
}

def main(args: Array[String]) = {

    //println("Total Cost = " + totalCost(60));
    printf("Total Cost = %.2f", totalCost(60));
}