package br.com.appsound.modelos;

public class Musica extends Audio{

    private String genero;
    private String album;
    private String autor;
    private String cantor;

    public String getGenero() {
        return genero;
    }

    public String getAlbum() {
        return album;
    }

    public String getAutor() {
        return autor;
    }

    public String getCantor() {
        return cantor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int getClassificação() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 8;
        }
    }
}
