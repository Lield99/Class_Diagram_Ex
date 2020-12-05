package test;

public class ZIP extends BinaryStringExpression{

    public ZIP(StringExpression left, StringExpression right) {
        super(left, right);
    }

    @Override
    public String calculate() {

        String rightValue = this.right.calculate();
        String leftvalue = this.left.calculate();
        String result = new String();

        int minLength = Math.min(leftvalue.length(), rightValue.length()) ;

        for(int index=0; index!= minLength; index++){
            result += "" + (leftvalue.charAt(index) + rightValue.charAt(index));

          if(leftvalue.length()!= minLength)
              result += leftvalue.substring(minLength);

          else if (rightValue.length()!= minLength)
              result += rightValue.substring(minLength);

        }
        return result;
    }
}
