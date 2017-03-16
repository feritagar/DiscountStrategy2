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
public class QuantityDiscount implements DiscountStrategy {

    private double qtyDiscount;
    
    public QuantityDiscount(double qtyDiscount) {
        setQtyDiscount(qtyDiscount);
    }
    
    public final double getQtyDiscount() {
        return qtyDiscount;
    }
    
    public final void setQtyDiscount(double qtyDiscount) {
        this.qtyDiscount = qtyDiscount;
    }
    
    @Override
    public double getDiscount(double retailCost, double quantity) {
        if (quantity >= 5) {
            qtyDiscount = retailCost * quantity * .25;
        } else if (quantity == 3) {
            qtyDiscount = retailCost * quantity * .20;
        } else {
            qtyDiscount = 0.15;
        }
        return qtyDiscount;
    }
    
}
