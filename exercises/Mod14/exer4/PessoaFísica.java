public class PessoaFísica extends Pessoa{

    private Double gastosComSaude;

    public PessoaFísica(){
        super();
    }

    public PessoaFísica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double calcularImposto() {
            return (super.getRendaAnual() * 0.25) - (gastosComSaude * 0.50);
    }


}
