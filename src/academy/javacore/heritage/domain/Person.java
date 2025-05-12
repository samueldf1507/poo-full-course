package academy.javacore.heritage.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Adress adress;

    static {
        System.out.println("Dentro do bloco de inicialização estático");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 2");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Dentro do construtor de pessoa");
    }

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public void printInformations() {
        System.out.println("Nome: " + this.name);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + adress.getStreet() + " | " + adress.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
