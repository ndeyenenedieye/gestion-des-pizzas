package abstrait;

public interface AbstractFactory {
	public AbstractOriental createOrientale();
	public AbstractReine createReine();
	public AbstractTroisFrommage createTroisFrommage();
	
	public static AbstractFactory getFactory(String type){
		AbstractFactory factory;
		if(type.equals("FR")){
			factory=new FactoryFR();
		}
		else if (type.equals("SN")) {
			factory=new FactorySN();
		}
		else {
			factory=new FactoryUSA();
		}
		return factory;
	}
}


