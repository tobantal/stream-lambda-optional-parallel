package com.da.parallelStreams;

public class Sum {
    
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public synchronized void performSum(int input) {
	total += input;
    }

}
