public class Code {
	
	private double num1= 0;
	private double num2 = 0;
	private char operation;  
	private double result = 0;
	protected int setNum2;
	
	
		 public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	
	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	
	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
	
	
	public double Evaluation()
	{
		if(operation=='+')
		  result=(num1+num2);
	    if(operation=='-')
		  result=(num1-num2);
	    if(operation=='*')
	      result=(num1*num2);
        if(operation=='/')
		  result=(num1/num2);	 
		  	  
		  return result;}
		 
	}

 
