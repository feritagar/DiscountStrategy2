/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author FA
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percent;

    public PercentageDiscount(double percent) {
        setPercent(percent);
    }

    public final double getPercent() {
        return percent;
    }

    public final void setPercent(double percent) {
        if (percent <= 0) {
            throw new IllegalAccessError("Please enter valid percentage data."
                    + "Percentage must be bigger than 0");
        }
        this.percent = percent;
    }

    @Override
    public double getDiscount(double retailPrice, double quantity) {

        return retailPrice * quantity * percent;

    }

}
