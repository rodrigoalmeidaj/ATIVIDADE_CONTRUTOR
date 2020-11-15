public class Notebook {
    //ATRIBUTOS
    private String marca;
    private double tamanho;

    //METODO CONSTRUTOR
    public Notebook(String marca, double tamanho){
        this.marca = marca;
        this.tamanho = tamanho;
    }

    //METODOS GETTERS
    public String getMarca(){
        return this.marca;
    }
    public double getTamanho(){
        return this.tamanho;
    }

    //METODOS SETTERS 
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
}
