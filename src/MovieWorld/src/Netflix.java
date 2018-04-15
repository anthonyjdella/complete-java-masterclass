class Netflix extends Movie implements Sellable{

    private String url;
    private int downloads;
    private int downloadFee = 10;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Override
    double calculateGrossProfit() {
        return (url.length() * downloads);
    }

    @Override
    public int sellMovies() {
        return 10000 * downloads;
    }
}
