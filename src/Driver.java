
public class Driver {
public static void main(String args[])
{
	System.out.println("Hello world");
	Car myCar =new Car();
	myCar.setBrand("Honda city");
	myCar.setCarId(123);
	System.out.println(myCar.getBrand() + myCar.getCarId());
	Bus myBus=new Bus();
	myBus.setBusId(456);
	myBus.setBusBrand("Ashok");
	System.out.println(myBus.getBusBrand() + myBus.getBusId());
	System.out.println("Bye..!");
	
}
}
