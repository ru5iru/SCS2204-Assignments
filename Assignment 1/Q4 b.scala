object q4b{
    def attendence(ticketPrice: Int): Int = {
        return 120 + ((15 - ticketPrice) / 5) * 20;
    }

    def totalIncome(ticketPrice: Int): Int = {
        return attendence(ticketPrice) * ticketPrice;
    }

    def cost(ticketPrice: Int): Int = {
        return 500 + 3 * attendence(ticketPrice);
    }

    def profit(ticketPrice: Int): Int = {
        return totalIncome(ticketPrice) - cost(ticketPrice);
    }

    def main(args: Array[String]) = {
        println("Input ticket price:");
        var ticketPrice = scala.io.StdIn.readInt();
        println("Profit = Rs. " + profit(ticketPrice));
    }
}