class TV extends Movie {

    private String channelName;

    @Override
    double calculateGrossProfit() {
        return channelName.length() * 100;
    }
}
