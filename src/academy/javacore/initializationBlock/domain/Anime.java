package academy.javacore.initializationBlock.domain;

public class Anime {
    private String name;
    private int[] episodes;
    //1 - Alocado espaço em memória pro objeto
    //2 - Cada atributo de classe é inicializado com valores default
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        this.episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode: this.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();

    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
