package isp;

public class DepositOperation extends Operation {

    DepositInt depositInt;

    public DepositOperation(DepositInt depositInt) {
        this.depositInt = depositInt;
    }

    @Override
    public void getOperation() {
        depositInt.requestDepositAmount();
    }
}
