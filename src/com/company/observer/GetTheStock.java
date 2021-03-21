package com.company.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;

    private final Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double randNum = (Math.random() * (0.06)) - 0.03;

            DecimalFormat df = new DecimalFormat("#.##");

            price += randNum;

            if (stock.equals("IBM")) {
                ((StockGrabber)stockGrabber).setIBMPrice(price);
            } else if (stock.equals("Apple")) {
                ((StockGrabber)stockGrabber).setApplePrice(price);
            } else {
                ((StockGrabber)stockGrabber).setGooglePrice(price);
            }
            System.out.println(stock + ": " + df.format((price + randNum)) +
                " " + df.format((randNum)));
            System.out.println();
        }
    }
}
