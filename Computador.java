package Teste;

public class Computador {
String marca;
String cor;
String modelo;
int numeroSerie;
double preco;
public void imprimir(){
System.out.println("Marca: "+marca);
System.out.println("Cor: "+cor);
System.out.println("Modelo: "+modelo);
System.out.println("Numero de Serie: "+numeroSerie);
System.out.println("Preco: "+preco);

}
public void calcularValor(){
if(marca.equalsIgnoreCase("HP")){
preco = preco+((preco*30)/100);
}
else
if(marca.equalsIgnoreCase("IBM")){
preco = preco+((preco*50)/100);
}
else{
preco = preco;
}

}
public double alterarValor(double valor){
if (valor>0){
preco = valor;
return 1.0;
}
else {
return 0;
}
}
}
