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

    private Customer customerId;
    private Product productId;
    private InMemoryDataAccess database;
    private LineItem[] lineItems;

    public Receipt(Customer customerId, Product productId) {
        setCustomer(customerId);
        setProduct(productId);
    }

    Receipt(String customerId, String productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final Customer getCustomer() {
        return customerId;
    }

    public final void setCustomer(Customer customerId) {
        this.customerId = customerId;
    }

    public final Product getProduct() {
        return productId;
    }

    public final void setProduct(Product productId) {
        this.productId = productId;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

}
