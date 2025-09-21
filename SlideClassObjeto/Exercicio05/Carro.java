public class Carro {
    String marca;
    String modelo;
    String placa;
    int ano;

public Carro(String marca, String modelo, String placa, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.placa = placa;
    this.ano = ano;
}
public void mostrarInformacoes() {
    System.out.println("Informações do Carro");
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Placa: " + this.placa);
    System.out.println("Ano: " + this.ano);
}
public void ligarCarro() {
    System.out.println("O " + this.modelo + " está ligado!");
    }
}