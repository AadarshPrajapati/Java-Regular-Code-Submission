package complexnumber;

public class SodaCan {
	
	protected float height,radious,volume,surfaceArea;
	
	public SodaCan(float height,float diameter ) {
		this.height=height;
		this.radious=diameter/2;
		
	}
	
	public void getVolumne() {
		this.volume=(float) ((22/7)*Math.pow(this.radious,2)*this.height);
		System.out.println("Volume is "+this.volume+" cmcube");
	}
	
	public void getSurfaceArea() {
		this.surfaceArea=2*(22/7)*this.radious*(this.radious+this.height);
		System.out.println("Surface area is "+this.surfaceArea+" cmsq");	}
}