package test;

public class Max extends BinaryStringExpression {

    public Max(StringExpression left, StringExpression right) {
        super(left, right);
    }

    @Override
    public String calculate() {
        String rightValue = this.right.calculate();
        String leftvalue = this.left.calculate();
        String result;

        if(leftvalue.compareTo(rightValue) > 0)
            return leftvalue;

        return rightValue;
    }
}
