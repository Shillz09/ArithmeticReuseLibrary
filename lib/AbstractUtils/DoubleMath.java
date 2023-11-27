package AbstractUtils;

public class DoubleMath extends MathAbstract<Double> {

	@Override
	public Double add(Double a, Double b) {
		return a+b;
	}

	@Override
	public Double subtract(Double a, Double b) {
		return a-b;
	}//(a-b)

	@Override
	public Double multiply(Double a, Double b) {
		return a*b;
	}

	@Override
	public Double divide(Double a, Double b) {
		return a/b;
	}//(a/b)

}
