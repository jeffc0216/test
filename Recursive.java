class Calc{
	public int add(int x, int y){
		return add(x, ++y);
	}
}

class Recursive{
	public static void main(String[] args){
		Calc calc = new Calc();
		System.out.println(calc.add(1, 1));
	}
}