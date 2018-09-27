package Live;

public class Cell {
	public int state;
	public int row;
	public int col;
	public int m;
	DrawMap drawMap =new DrawMap();
	Cell(){
		
	}
	public void reproduction() {	
		for(int i=1;i<DrawMap.number+1;i++) {
			for(int j=1;j<DrawMap.number+1;j++) {
				 m=0;
			for(int k=i-1;k<i+2;k++) {
				for(int l=j-1;l<j+2;l++) {
					if(k==i && l==j)
						continue;
					if(DrawMap.map[k][l]==1) {
						m++;
					}
				}
			}
			switch(m) {
			case 3:
				DrawMap.map1[i][j]=1;
				break;
			case 2:
				continue;
			default:
				DrawMap.map1[i][j]=0;
				}
			}	
		}
		for(int i=1;i<DrawMap.number+1;i++) {
			for(int j=1;j<DrawMap.number+1;j++) {
				DrawMap.map[i][j]=DrawMap.map1[i][j];
			}
			}
		drawMap.updatemap();
	}
}
