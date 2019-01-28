import javax.swing.JFrame;

public class LinhasTeste {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Linhas linha = new Linhas();
		frame.add(linha);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}

}
