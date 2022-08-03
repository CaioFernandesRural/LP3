public class Main {
    
    public static void main(String[] args) {
        
        //herança = processo onde uma classe adquire
        //atributos e métodos de outra.

        Carro carro = new Carro();

        //carro.go();

        Bicicleta bicicleta = new Bicicleta();

        //bicicleta.stop();

        //System.out.println(carro.speed);
        //System.out.println(bicicleta.speed);

        System.out.println(carro.portas);
        System.out.println(bicicleta.pedais);
    }
}
