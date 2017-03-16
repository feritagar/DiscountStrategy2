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
    private Customer customer;
    private int quanity;
    private double subTotal;

    public LineItem(Product product, Customer customer, int quanity) {
        setProduct(product);
        setCustomer(customer);
        setQuanity(quanity);

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

    public final double getSubTotal() {
        return subTotal;
    }

    public final void setTotal(double subTotal) {

        this.subTotal = product.getRetailCost() * quanity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
