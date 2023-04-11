public class Pound50Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextHandler(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50 ){
            int num = cur.getAmount()/50;
            int remainder = cur.getAmount() % 50;
            System.out.println(num+" £50 note(s)");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
