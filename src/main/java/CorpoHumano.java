package main.java;

public class CorpoHumano {
    private float massa; 
    // Se esse método fosse public float massa, a ocorrência seria a inutilidade dos getters e setters e resultaria em 
    // um erro pois todo o restante do código trata massa como tipo inteiro. 
    private double volume; 
    private int densidade;
    private double altura;

    public CorpoHumano(float massa, double volume, int densidade, double altura){
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }
    

    public float getMassa(){
        return this.massa;
    }
    
    public void setMassa(int massa){ // private set volume resultaria em um erro pois não permite mais o acesso
        this.massa = massa;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public void setVolume(double volume){
        this.volume = volume;
    }
    
    public int getDensidade(){
        return this.densidade;
    }
    
    public void setDensidade(int densidade){
        this.densidade = densidade;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }


    public double calcularIMC(){
        return massa / (altura * altura);
    }
}
