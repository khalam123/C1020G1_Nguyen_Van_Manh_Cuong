package caculator;


public class Calculator {
    public static double calculator(String num1,String operator,String num2) throws Exception {
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        if (operator.equals("addition")){
            return  number1 + number2;
        }else if (operator.equals("minus")){
            return number1 - number2;
        }else if (operator.equals("multiple")){
            return  number1 * number2;
        }else
            if (number2 !=0){
                return number1 / number2;
            }else{
                throw new Exception("Can't divide 0");
            }
    }
}
