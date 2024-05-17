public class PessoaJurídica extends Pessoa{
    private int numeroDeFuncionarios;

    public PessoaJurídica(){
        super();
    }

    public PessoaJurídica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double calcularImposto() {
       if(numeroDeFuncionarios <= 10 ){
            return super.getRendaAnual() * 0.16;
        }else {
           return super.getRendaAnual() * 0.14;
       }
    }


}
