public class ProjetoCarro {
public static void main(String[] args) {
    Carro carro1 = new Carro("Toyota", "Corolla", "Pzl1256", 2022);
    Carro carro2 = new Carro("Ford", "Fusion", "Tsx5746", 2020);

    System.out.println("Carros antes da modificação");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

    carro2.modelo = "Focus";
    carro2.ano = 2020;

    System.out.println("Carros após a modificação");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

    System.out.println("Chamando os métodos");
        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}