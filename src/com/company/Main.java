package com.company;

import com.company.observer.GetTheStock;
import com.company.observer.StockGrabber;
import com.company.observer.StockObserver;

public class Main {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getApple = new GetTheStock(stockGrabber, 2, "Apple", 677.60);
        Runnable getGoogle = new GetTheStock(stockGrabber, 2, "Google", 676.40);

        new Thread(getIBM).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();
    }
}
