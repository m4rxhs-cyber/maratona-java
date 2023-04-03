package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - * /
        int number01 = 23;
        int number02 = 45;
        int plus = number01 + number02;
        int minus = number02 - number01;
        int multiplied = number01 * number02;
        int division = number02 / number01;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiplied);
        System.out.println(division);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores comparação: < > <= >= == !=
        // Eles sempre irão trazer valores booleando: true ou false

        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorIgualQueVinte: "+isDezMaiorIgualQueVinte);
        System.out.println("isDezMenorIgualQueVinte: "+isDezMenorIgualQueVinte);
        System.out.println("isDezIgualQueVinte: "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte: "+isDezDiferenteQueVinte);

        //Operadores Lógicos: && (AND) || (OR)

        //AND
        int idade = 34;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3338;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+ isDentroDaLeiMenorQueTrinta);

    }
}
