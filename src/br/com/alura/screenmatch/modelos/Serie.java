package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int tempradas;
    private boolean ativo;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTempradas() {
        return tempradas;
    }

    public void setTempradas(int tempradas) {
        this.tempradas = tempradas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return tempradas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
