package br.com.appsound.modelos;

public class MinhasPreferidas {

    public String inclui(Audio audio){

        if ( audio.getClassificação() > 9){
            return "A classificação de " + audio.getTítulo() + " é EXCELENTE!";
        }else{
            return "A classificação de " + audio.getTítulo() + " é BOA!";
        }
    }
}
