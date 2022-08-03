public class Main {
    
    public static void main(String[] args) {
        
        //herança = habilidade de um objeto se
        //indentificar como mais de um tipo

        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();
        Barco barco = new Barco();

        //o tipo da array não pode ser uma classe só, tem de abrangir todas
        Veiculo[] corredores = {carro, bicicleta, barco};
/* 
        carro.ir();
        bicicleta.ir(); //imprático
        barco.ir();
*/
        for(Veiculo x : corredores){
            x.ir();
        }
    }
}
