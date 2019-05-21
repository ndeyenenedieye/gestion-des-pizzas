package abstrait;

public class FactoryUSA implements AbstractFactory {

	@Override
	public AbstractOriental createOrientale() {
		// TODO Auto-generated method stub
		return new OrientalUSA();
	}

	@Override
	public AbstractReine createReine() {
		// TODO Auto-generated method stub
		return new ReineUSA();
	}

	@Override
	public AbstractTroisFrommage createTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageUSA();
	}

}
