import br.com.appsound.modelos.MinhasPreferidas;
import br.com.appsound.modelos.Musica;
import br.com.appsound.modelos.Podcast;

public class MainAppSound {
    public static void main(String[] args) {

        System.out.println("APP SOUND");

        //Implementando a casse de Tetes
        /*
        ClasseTeste teste = new ClasseTeste("Andre", 1000.00);
        System.out.println("Seu objeto recebeu os valores: " + teste.getNome() + " e " + teste.getValor() + " Pelo método construtor da classe " + teste);
        */

        //Musica
        Musica minhaMusica = new Musica();
        minhaMusica.setTítulo("Labelle de Jur");

        for (int i = 0; i < 2345; i++){
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 712; i++){
            minhaMusica.curtir();
        }


        //Podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTítulo("Hipster");
        meuPodcast.setCategoria("Tecnologia da Informação");;

        for (int i = 0; i < 1045; i++){
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 458; i++){
            meuPodcast.curtir();
        }

        MinhasPreferidas classificacaoPreferidas = new MinhasPreferidas();

        //Apresentações
        System.out.println("A música " + minhaMusica.getTítulo() + " possui o total de " + minhaMusica.getTotalReproducoes() + " Reproduções e " + minhaMusica.getCurtidas() + " Likes. " + classificacaoPreferidas.inclui(minhaMusica));

        System.out.println("O Podcast " + meuPodcast.getTítulo() + " possui o total de " + meuPodcast.getTotalReproducoes() + " Reproduções e " + meuPodcast.getCurtidas() + " Likes. " + classificacaoPreferidas.inclui(meuPodcast));
    }
}