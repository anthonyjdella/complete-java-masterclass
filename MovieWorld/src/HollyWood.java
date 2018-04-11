class HollyWood extends Movie implements Sellable{

    private int numberOfTickets;
    private int priceOfTickets = 6;

    @Override
    double calculateGrossProfit() {
        return numberOfTickets * name.length();
    }

    @Override
    public int sellMovies() {
        return 10000 * numberOfTickets;
    }
}
