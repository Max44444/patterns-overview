package com.company.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIDTracker = 0;

    private final int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID +
            "\nIBM: " + ibmPrice +
            "\nApple: " + applePrice +
            "\nGoogle: " + googlePrice);
    }
}
