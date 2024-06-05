package Entidades.Enums;

public enum Nivel_Trabalho {
    JUNIOR(0),PLENO(1),SENIOR(2);
    int codigoNivelTrabalho;
    Nivel_Trabalho(int codigoNivelTrabalho){
        this.codigoNivelTrabalho = codigoNivelTrabalho;
    }

    public int getCodigoNivelTrabalho() {
        return codigoNivelTrabalho;
    }
}
