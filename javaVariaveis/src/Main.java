public class Main{
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv(); // criamos uma classe de interacao com metodos e atributos
        Saudacao saudacao = new Saudacao(); // criamos um objeto apartir da classe
        velocidade v = new velocidade();
        System.out.println("A televisao esta no canal: " + smartTv.canal);
        System.out.println("Volume atual da televisao: " + smartTv.volume);
        System.out.println("A televisdao esta ligada: " + smartTv.lidada);


        String mensagem = saudacao.saudacao("miguel");
        System.out.println(mensagem);
        int resultado = v.soma(10,20);
        System.out.println("O resultado da soma e "+resultado);

    }

    class bemVindo(velocidade v){
        String bemVin(){
            return "bem vindo" + v;
        }
    }
}