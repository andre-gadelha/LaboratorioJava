package br.com.appsound.modelos;

public class Audio {
    private String título;
    private double duração;
    private int totalReproducoes;
    private int curtidas;
    private int classificação;

    public String getTítulo() {
        return título;
    }

    public double getDuração() {
        return duração;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificação() {
        return classificação;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void curtir(){

        this.curtidas ++;
    }

    public void reproduzir(){

        this.totalReproducoes ++;
    }


}
