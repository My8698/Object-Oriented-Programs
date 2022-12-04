package com.bridgelabz.oops;
public class StockInfo {
    private String stockName;
    private String numberOfShare;
    private String sharePrice;
    /**
     * calling getter and setter method at the stockName
     */
    public String getStockName() {
        return stockName;
    }
    /**
     *  stockName the stockName to set
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    /**
     * the numberOfShare
     */
    public String getNumberOfShare() {
        return numberOfShare;
    }
    /**
     *  numberOfShare the numberOfShare to set
     */
    public void setNumberOfShare(String numberOfShare) {
        this.numberOfShare = numberOfShare;
    }
    /**
     * @return the sharePrice
     */
    public String getSharePrice() {
        return sharePrice;
    }
    /**
     * @param sharePrice the sharePrice to set
     */
    public void setSharePrice(String sharePrice) {
        this.sharePrice = sharePrice;
    }

    /**
     *calling toString method to print all attributes
     */
    @Override
    public String toString() {
        return "StockInfo [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice + "]";
    }

}


