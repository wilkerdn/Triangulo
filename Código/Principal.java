import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Triangulo t1,t2,t3;
		t1 = new Triangulo();
		t1.base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo:"));
		t1.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
		for(int i=0; i<3; i++) {
			t1.lados[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite  lado " + (i+1) + " do triângulo:"));
		}
		t1.impressao();
		
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo:"));
		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
		t2 = new Triangulo(b, a);
		for(int i=0; i<t2.lados.length; i++) {
			t2.lados[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado " + (i+1) + " do triângulo:"));
		}
		t2.impressao();
		
		b = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo:"));
		a = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
		float[] vetor = new float[3];
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado " + (i+1) + " do triângulo:"));
		}
		t3 = new Triangulo(b, a, vetor);
		t3.impressao();
		
		Triangulo[] t = new Triangulo[3];
		t[0] = new Triangulo();
		t[0].lados[0] = 5;
		t[0].impressao();
	}
}
