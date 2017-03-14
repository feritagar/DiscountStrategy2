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
public class LineItem {

    private Product product;
    private int quanity;
    private double total;

    public LineItem(Product product, int quanity, double total) {
        setProduct(product);
        setQuanity(quanity);
        setTotal(total);
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {

        this.product = product;
    }

    public final int getQuanity() {
        return quanity;
    }

    public final void setQuanity(int quanity) {

        this.quanity = quanity;
    }

    public final double getTotal() {
        return total;
    }

    public final void setTotal(double total) {
        this.total = total;
    }
    

}
