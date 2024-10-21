package Polimorfismo;

public class Main
{
    public static void main(String[] args)
    {
        Animal toby = new Perro();
        toby.hacerSonido();

        Animal gato1 = new Gato();
        gato1.hacerSonido();
    }
}
