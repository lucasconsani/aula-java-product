public class Pessoa {
    private char genero;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(char genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

}
