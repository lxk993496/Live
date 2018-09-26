package Live;

public class MainClass {

	public static void main(String[] args) {
		Cell cell=new Cell();
		while(true) {
			try {
				Thread.sleep(5 * 100); //设置暂停的时间 0.5秒
				cell.reproduction();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		
		}
	}

}
