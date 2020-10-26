package br.example.listview;

public class Contato {
    private String nome;
    private String telefone;
    private int fotoId;
    public Contato() {
    }
    public Contato(String nome,
                   String telefone,
                   int fotoId) {
        this.nome = nome;
        this.telefone = telefone;
        this.fotoId = fotoId;
    }
    public String toString() {
        return "Nome: " + this.nome +
                " - Fone: " + this.telefone;
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(
            String telefone) {
        this.telefone = telefone;
    }
    public int getFotoId() {
        return fotoId;
    }
    public void setFotoId(int fotoId){
        this.fotoId = fotoId;
    }
}