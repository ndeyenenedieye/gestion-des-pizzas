package abstrait;

public class FactorySN implements AbstractFactory {

	@Override
	public AbstractOriental createOrientale() {
		// TODO Auto-generated method stub
		return new OrientalSN();
	}

	@Override
	public AbstractReine createReine() {
		// TODO Auto-generated method stub
		return new ReineSN();
	}

	@Override
	public AbstractTroisFrommage createTroisFrommage() {
		// TODO Auto-generated method stub
		return new TroisFrommageSN();
	}

}
