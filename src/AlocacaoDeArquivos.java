/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Matheus
 */
public abstract class AlocacaoDeArquivos {
    private String nome;
    private String Diretorio;
    private int Tamanho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretorio() {
        return Diretorio;
    }

    public void setDiretorio(String Diretorio) {
        this.Diretorio = Diretorio;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }
}
