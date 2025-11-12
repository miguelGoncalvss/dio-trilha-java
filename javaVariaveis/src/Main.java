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

    class bemVindo {

        velocidade v;


        public bemVindo(velocidade v) {
            this.v = v; // "this.v" (o campo da classe) recebe "v" (o parâmetro)
        }

        // 3. O método agora usa o campo "v" que foi salvo
        String bemVin(){
            return "bem vindo" + v;
        }
    }
}