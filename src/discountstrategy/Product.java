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
public class Product {

    private String productName;
    private String productId;
    private double retailCost;
    private DiscountStrategy discount;
    
    public Product(String productName, String productId, double retailCost, DiscountStrategy discount) {
        setProductName(productName);
        setProductId(productId);
        setRetailCost(retailCost);
        setDiscount(discount);
        
    }
    
    public final String getProductName() {
        return productName;
    }
    
    public final void setProductName(String productName) {
        this.productName = productName;
    }
    
    public final String getProductId() {
        return productId;
    }
    
    public final void setProductId(String productId) {
        this.productId = productId;
    }
    
    public final double getRetailCost() {
        return retailCost;
    }
    
    public final void setRetailCost(double retailCost) {
        this.retailCost = retailCost;
    }
    
    public final DiscountStrategy getDiscount() {
        return discount;
    }
    
    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
}
