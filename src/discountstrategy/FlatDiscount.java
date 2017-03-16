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
public class FlatDiscount implements DiscountStrategy {
       private final double flatDiscountPercentage = 0.10;
    @Override
    public double getDiscount(double retailCost, double quantity) {
        
        return retailCost * quantity * flatDiscountPercentage;

    }

}
