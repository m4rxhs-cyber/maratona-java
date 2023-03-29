package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int age = (int) 134589073450L;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;  //se você colocar um valor número, ele irá traduzir para a tabela ASCII. Exemplo: 65=A

        //String no Java não é um tipo primitivo, e sim uma classe.
        //Strings deverão sempre estar entre aspas duplas
        String nome = "Arlindo Silva da Souza";



        System.out.println("A idade é " + age);
        System.out.println("Char " + caractere);
        System.out.println("Meu nome é " + nome);


        //Casting é você forçar um valor em uma espaço da memória mesmo que ela não tenha espaço.
        //Caso você faça isso, o sistema irá cortar os bits até o valor couber neste espaço de memória.
        // Para fazer um casting, bastar adicionar um parêntese antes do valor e especificar o tipo.
        //Ex: int teste = (int) 100000000000000L; *O  "L" é para informar que aquele número é um LONG*

    }
}
