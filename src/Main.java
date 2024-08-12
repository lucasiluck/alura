import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.setEpisodiosPorTemporada(15);

        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    }

}
