package complexnumber;

public class classComplex {
	 private final double re;   // the real part
	 private final double im;   // the imaginary part
	 
	// create a new object with the given real and imaginary parts
	 public classComplex(double real, double imag) {
		re=real;
		im=imag;
	}
	 
	 // return a string representation of the invoking Complex object
	    public String toString() {
	        if (im == 0) return re + "";
	        if (re == 0) return im + "i";
	        if (im <  0) return re + " - " + (-im) + "i";
	        return re + " + " + im + "i";
	    }
	   

	    // return a new Complex object whose value is (this + b)
	    public classComplex plus(classComplex b) {
	        classComplex a = this;             // invoking object
	        double real = a.re + b.re;
	        double imag = a.im + b.im;
	        return new classComplex(real, imag);
	    }
	    
	    // return a new Complex object whose value is (this - b)
	    public classComplex minus(classComplex b) {
	        classComplex a = this;
	        double real = a.re - b.re;
	        double imag = a.im - b.im;
	        return new classComplex(real, imag);
	    }

	    // return a new Complex object whose value is (this * b)
	    public classComplex times(classComplex b) {
	        classComplex a = this;
	        double real = a.re * b.re - a.im * b.im;
	        double imag = a.re * b.im + a.im * b.re;
	        return new classComplex(real, imag);
	    }
	    
	    // return a new Complex object whose value is the reciprocal of this
	    public classComplex reciprocal() {
	        double scale = re*re + im*im;
	        return new classComplex(re / scale, -im / scale);
	    }
	    
	    // return a / b
	    public classComplex divides(classComplex b) {
	        classComplex a = this;
	        return a.times(b.reciprocal());
	    }

}
