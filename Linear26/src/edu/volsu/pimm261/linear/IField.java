package src.edu.volsu.pimm261.linear;

public interface IField<T> {
	T add(T that);
	T getOpposite();
	T mult(T that);
	T inverse();
	boolean isZero();
	default T getInverse() {
		if (!isZero()) return inverse();
		else throw new ArithmeticException("divizion by Zero");
	}
	default T diff(IField<T> that) {
		return this.add(that.getOpposite());
	}
	
	default T div (IField<T> that) {
		return this.mult(that.getInverse());
	}
}
