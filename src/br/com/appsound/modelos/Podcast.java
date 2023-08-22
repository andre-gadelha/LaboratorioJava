package br.com.appsound.modelos;

public class Podcast extends Audio {

    private String categoria;
    private String apresentador;
    private String descricao;

    public String getCategoria() {
        return categoria;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificação() {
       if(this.getCurtidas() > 700){
            return 10;
       }else{
           return 8;
       }
    }
}
