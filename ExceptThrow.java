class ExceptThrow{
	public static void main(String[] args){
		double x = 1.0, y = 0.0, result;
		try{
			if(y == 0.0)
				throw new ArithmeticException("除數不可為0或0.0");
			else
				result = x/y;
			System.out.println("運算結果 = " + result);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}