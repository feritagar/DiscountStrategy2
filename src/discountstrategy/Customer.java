/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author FA
 */
public class Customer {

    private String customerName;
    private String customerId;

    public Customer(String customerName, String customerId) {
        setCustomerName(customerName);
        setCustomerId(customerId);
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        if (customerName == null || customerName.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: Customer name is not in the database");
            System.exit(0);

        }
        this.customerName = customerName;
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        if (customerId == null || customerId.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: Customer id is not in the database");
            System.exit(0);

        }
        this.customerId = customerId;
    }
    
    public final Customer findCustomer(final String custId){
        return null;
        
    } 

}
