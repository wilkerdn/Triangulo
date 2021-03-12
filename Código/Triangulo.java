import javax.swing.JOptionPane;

public class Triangulo {
	public float base;
	public float altura;
	public float[] lados;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
		lados = new float[3];
	}
	
	public Triangulo(float base, float altura, float[] lados) {
		this.base = base;
		this.altura = altura;
		this.lados = lados;
	}
	
	public Triangulo() {
		base = 0;
		altura = 0;
		lados = new float[3];
	}
	
	public float area() {
		float area = (base*altura)/2;
		return area;
	}
	
	public float perimetro() {
		float perimetro = lados[0] + lados[1] + lados[2];
		return perimetro;
		
	}
	
	public void impressao() {
		JOptionPane.showMessageDialog(null,"INFORMAÇÕES DO TRIÂNGULO:\n" + "Base: " + base + "\nAltura: " + altura +
				"\nLado 1: " + lados[0] + "\nLado 2: " + lados[1] + "\nLado 3: " + lados[2] + "\nÁrea:  " + area() +
				"\nPerímetro:  " + perimetro(), "Janela do Triângulo", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
