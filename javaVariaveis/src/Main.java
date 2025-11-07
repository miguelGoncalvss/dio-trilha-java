public class Main{
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv(); // criamos uma classe de interacao com metodos e atributos
        System.out.println("A televisao esta no canal: " + smartTv.canal);
        System.out.println("Volume atual da televisao: " + smartTv.volume);
        System.out.println("A televisdao esta ligada: " + smartTv.lidada);

    }
}