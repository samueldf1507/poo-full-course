package academy.javacore.constructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    public Anime(String name, String type, int episodes, String gender) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String name, String type, int episodes, String gender, String studio) {
        this(name, type, episodes, gender);
        this.studio = studio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void printAnimeInformations() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
        System.out.println(this.studio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
