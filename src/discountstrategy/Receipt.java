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
class Receipt {

    private Customer customer;
    private Product product;
    private LineItem[] lineItems;

    public Receipt(Customer customer, Product product, LineItem[] lineItems) {
        setCustomer(customer);
        setProduct(product);
        setLineItems(lineItems);
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

}
