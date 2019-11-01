public class Calculator implements java.io.Serializable{
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;


    public double getOperandOne(){
        return operandOne;
    }

    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }

    public String getOperation(){
        return operation;
    }
    // if the operation is not "+" or "-" an error will show
    public void setOperation(String operation){
        if(operation == "+" || operation == "-"){
            this.operation = operation;
        }
        else{
            System.err.prinlt("Invalid operation");
        }
    }
    public double getOperandTwo(){
        return operandTwo;
    }
    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }
    //determin if the operation is "+" or "-" and set result accordingly
    public void performOperation(){
        if(getOperation == "+"){
            this.result = getOperandOne()+getOperandTwo();
        } else if(getOperation() == "-"){
            this.result = getOperandOne()-getOperandTwo();
        } else {
            System.err.println("Invalid");
        }
    }

    public void getResults(){
        System.out.println(this.result);
    }
}