/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Computador {
    private String Nome;
    private USB[] US;
    private Paralela[] PAR;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public USB[] getUS() {
        return US;
    }

    public void setUS(USB[] US) {
        this.US = US;
    }

    public Paralela[] getPAR() {
        return PAR;
    }

    public void setPAR(Paralela[] PAR) {
        this.PAR = PAR;
    }
}
