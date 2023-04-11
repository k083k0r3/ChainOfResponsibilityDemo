public class Pound5Dispenser implements DispenseChain{

    private DispenseChain chain;

    @Override
    public void setNextHandler(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 5){
            int num = cur.getAmount()/5;
            int remainder = cur.getAmount() % 5;
            System.out.println(num+" £5 note(s)");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
