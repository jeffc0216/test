class ExceptHandle{
	public static void main(String[] args){
		int x = 1, y = 0;
		try{
			int result = x/y;
			System.out.println("運算結果 = " + result);
		}
		catch(ArithmeticException e){
			System.out.println("除數不可輸入0");
			System.out.println("原始錯誤訊息：");
			e.printStackTrace();
			//System.exit(0); //強迫終止程式
		}
		finally{
			System.out.println("一定要執行的程式");
		}
		System.out.println("繼續執行...");
	}
}