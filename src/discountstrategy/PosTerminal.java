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
public class PosTerminal {

    private Receipt receipt;

    public PosTerminal() {
        setReceipt(receipt);
    }
   
    public final void startSale(String string) {
    }

    public final void addItemToSale(String productId, int i) {
    }

    public final void endSale() {

    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

}
