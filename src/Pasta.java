/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;

/**
 *
 * @author Matheus
 */
public class Pasta extends AlocacaoDeArquivos{
    private List<AlocacaoDeArquivos> Arquivos;

    public List<AlocacaoDeArquivos> getArquivos() {
        return Arquivos;
    }

    public void setArquivos(List<AlocacaoDeArquivos> Arquivos) {
        this.Arquivos = Arquivos;
    }
}
