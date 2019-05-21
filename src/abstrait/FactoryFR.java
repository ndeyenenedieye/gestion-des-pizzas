package abstrait;

public class FactoryFR implements AbstractFactory {

	@Override
	public AbstractOriental createOrientale() {
		// TODO Auto-generated method stub
		return new OrientalFR();
	}

	@Override
	public AbstractReine createReine() {
		// TODO Auto-generated method stub
		return new ReineFR() ;
	}

	@Override
	public AbstractTroisFrommage createTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageFR();
	}

}
