
public class A extends B{

public void test(){
		
		System.out.println("In Class A");
		
	}
public void callSuper(){
	   
	super.test(); //calls test method of B
	//super.super.test(); generate error
	//::test(); generates error
	//C.test(); can't make call to nonstatic method
}
public static void main(String args[]){
	A a=new A();
	a.callSuper();
	
}
}

 //option 'f' not possible to call method in class C without creating object... 
//if we want to do so we have to create test method static in class C... 
//but that way we can not override test 