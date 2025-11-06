public class Variaveis {
    /*
    * Em java possuimos alguns tipos primitivos de objetos que devem ser mantidos
    * Todos eles sao usados para declarar uma variavel
    * sendo eles:
    * int - para numeros inteiros
    * byte - numero inteiro, porem indo -127 a 125 -> 8 bits
    * short -numero inteir, porendo indo -32.768 a 32.767
    * long - numero inteiro muito grande - -9.223.372.036.854.775.808 a ...807
    * float - numeros quebrados de pocuas casas decimais -> 32 bits
    * double - numeros quebrados de maiores casas  -> 64 bits
    * boolean - para valores true or false | valores binarios - 1 bit
    * char - armazena somente um caractere - 16 bits
    *
    * todos esses dados sao armazenados da Memory Stack - por isso o tamanho de cada um
    */

    public static void main(String[] args) {
        // exemplo de codigo das variaveis
        byte idade = 12;
        int ano = 2025;
        short mes = 10;
        long cpf = 387943256312312L; // usar o L para identificar valores do tipo Long

        final double valorDePi = 3.1412343;
        // nesta linha de codigo notamos que o final define se o valor sera constante - imutavel

        System.out.println("Idade: " + valorDePi);


    }
}
