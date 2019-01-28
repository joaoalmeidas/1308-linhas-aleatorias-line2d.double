import javax.swing.JFrame;

public class LinhasTeste {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Linhas circ10 = new Linhas();
		frame.add(circ10);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

}
