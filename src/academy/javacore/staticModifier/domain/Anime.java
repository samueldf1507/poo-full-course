package academy.javacore.staticModifier.domain;

public class Anime {
    private String name;
    private  static int[] episodes;
    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória pro objeto
    //2 - Cada atributo de classe é inicializado com valores default
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
   static {
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático 3");
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
