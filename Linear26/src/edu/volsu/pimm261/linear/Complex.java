package src.edu.volsu.pimm261.linear;

public class Complex implements IField<Complex> { //Q[i]
float re;
float im;
public Complex(float a, float b) {
	re=a;
	im=b;
}
@Override
public Complex add(Complex that) {
	return new Complex(this.re+that.re, this.im+ that.im);
}
@Override
public Complex getOpposite() {
	return new Complex(-this.re, -this.im);
}
@Override
public Complex mult(Complex that) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Complex getInverse() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Complex inverse() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isZero() {
	// TODO Auto-generated method stub
	return false;
}

}
