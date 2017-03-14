
package discountstrategy;

/**
 *
 * @author FA
 */
public class Startup {

    public static void main(String[] args) {
        PosTerminal pos = new PosTerminal();
        pos.startSale("100");
        pos.addItemToSale("A01",1);
        pos.addItemToSale("B01", 3);
        pos.endSale();
    }
    
}
