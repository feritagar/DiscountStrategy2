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
public interface DataAccessStrategy {

    public abstract Customer findCustomer(final String customerId);

    public abstract Product findProduct(final String productId);
}
