package Live;

public class MainClass {

	public static void main(String[] args) {
		Cell cell=new Cell();
		while(true) {
			try {
				Thread.sleep(5 * 100); //������ͣ��ʱ�� 0.5��
				cell.reproduction();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		
		}
	}

}
