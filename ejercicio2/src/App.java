public class App {
    public static void main(String[] args) throws Exception {
        Coche mustang = new Coche(4);
        System.out.println(mustang.puertas);
    }

}

class Coche {

    int puertas;

    Coche(Integer puertas) {
        this.puertas = puertas;
    }

    void incrementar(){
        this.puertas++;
    }
}