package ExploringMars;

public class CartesianPlan {
	public int axisX;
	public int axisY;
	
	
	
	
	public int getAxisX() {
		return axisX;
	}




	public void setAxisX(int axisX) {
		this.axisX = axisX;
	}




	public int getAxisY() {
		return axisY;
	}




	public void setAxisY(int axisY) {
		this.axisY = axisY;
	}




	public CartesianPlan(int axisX, int axisY) {
		super();
		this.setAxisX(axisX);
		this.setAxisY(axisY);
	}
}
