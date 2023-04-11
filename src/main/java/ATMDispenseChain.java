public class ATMDispenseChain {

    protected DispenseChain note50;

    public ATMDispenseChain() {
        // initialize the handlers
        this.note50 = new Pound50Dispenser();
        DispenseChain note20 = new Pound20Dispenser();
        DispenseChain note10 = new Pound10Dispenser();
        DispenseChain note5 = new Pound5Dispenser();
        DispenseChain note1 = new Pound1Dispenser();

        // set the chain of handlers in order
        note50.setNextHandler(note20);
        note20.setNextHandler(note10);
        note10.setNextHandler(note5);
        note5.setNextHandler(note1);
    }
}
