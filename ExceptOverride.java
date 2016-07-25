import java.io.*; //IOException在java.io套件內
class SupCla{	
	protected void mX() throws RuntimeException{}
}
class SubCla1 extends SupCla{
	public void mX() throws ArithmeticException{}
}
class SubCla2 extends SupCla{
	//public void mX() throws RuntimeException, IOException{} 
}
class SubCla3 extends SupCla{
	//public void mX() throws Exception{}
}
class SubCla4 extends SupCla{
	public void mX() throws ArithmeticException, RuntimeException{} 
}
