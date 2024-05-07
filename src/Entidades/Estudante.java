package Entidades;

public class Estudante {
    public String nome;
    public double nota1;//Máximo 30
    public double nota2;//Máximo 35
    public double nota3;//Máximo 35
    public double MediaAluno(){
        //O máximo das 3 notas é 100
        return nota1+nota2+nota3;
    }
    public double PontosQueFaltaram(){
        if(MediaAluno()<60.0){
            return 60.0 - MediaAluno();
        }
        else{
            return 0.0;
        }
    }


}
