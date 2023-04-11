public interface DispenseChain {
    //method to set the chain
    void setNextHandler(DispenseChain nextChain);

    // Method to dispense currency
    void dispense(Currency cur);
}
