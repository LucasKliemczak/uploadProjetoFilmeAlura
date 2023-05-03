package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private Double somaDasAvaliacoes = 0.0;
    private int totalDeAvaliacoes = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome(){
        return nome;
    }
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    public boolean isIncluidoNoPlano(){
        return incluidoNoPlano;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println(("-----------------------------------------"));
        System.out.println("Título: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        //System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        //System.out.println(incluidoNoPlano?"incluso":"Não incluso");
        //System.out.println("Avaliação: " + pegaMedia());
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

}
