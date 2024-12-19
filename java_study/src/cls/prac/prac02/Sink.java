package cls.prac.prac02;

public class Sink {

	int sizeX, sizeY, sizeZ;   // 가로 세로 깊이 사이즈
	String color;
	String jj;  //재질
	
	public Sink() {
		sizeX = 0;
		sizeY = 0;
		sizeZ = 0;
		color = "silver";
		jj = "stan";
	}

	public Sink(int x,int y, int z) {
		sizeX = x;
		sizeY = y;
		sizeZ = z;
		color = "silver";
		jj = "stan";
	}
	
	public int getSizeX() { //mm
		return sizeX;
	}
	public double getSizeXasCm() { //m, cm
		return sizeX/10.0;  //450mm=> 45cm
	}
		
}
