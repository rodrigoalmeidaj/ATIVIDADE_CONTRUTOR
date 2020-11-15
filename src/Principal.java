public class Principal {
    public static void main(String[] args) throws Exception {
        Notebook notebook01 = new Notebook("Dell", 13);
        Notebook notebook02 = new Notebook("Lenovo", 15.6);

        System.out.println("-- LISTA DE NOTEBOOKS --");
        System.out.println("Marca: "+ notebook01.getMarca() );
        System.out.println("Tamanho: "+ notebook01.getTamanho()+" Polegadas");
        System.out.println("-------------");
        System.out.println("Marca: "+ notebook02.getMarca());
        System.out.println("Tamanho: "+ notebook02.getTamanho()+" Polegadas");

    }
}
