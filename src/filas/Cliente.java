package filas;


public class Cliente {
    private String nome;
    private int horachegada;
    private int minutochegada;
    private int horaatendimento;
    private int minutoatendimento;
    private double valorgasto;
    
    public Cliente(String nome, int horachegada, int minutochegada){
        this.nome = nome;
        this.horachegada = horachegada;
        this.minutochegada = minutochegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorachegada() {
        return horachegada;
    }

    public void setHorachegada(int horachegada) {
        this.horachegada = horachegada;
    }

    public int getMinutochegada() {
        return minutochegada;
    }

    public void setMinutochegada(int minutochegada) {
        this.minutochegada = minutochegada;
    }

    public int getHoraatendimento() {
        return horaatendimento;
    }

    public void setHoraatendimento(int horaatendimento) {
        this.horaatendimento = horaatendimento;
    }

    public int getMinutoatendimento() {
        return minutoatendimento;
    }

    public void setMinutoatendimento(int minutoatendimento) {
        this.minutoatendimento = minutoatendimento;
    }

    public double getValorgasto() {
        return valorgasto;
    }

    public void setValorgasto(double valorgasto) {
        this.valorgasto = valorgasto;
    }
    
}
