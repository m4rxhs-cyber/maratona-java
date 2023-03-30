package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo  entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Neemias Honorio Sales";
        String adress = "Rua Teste da Silva, nº 1337, bairro Hackudão";
        double salary = 2198.45;
        String dateSalaryReceipt = "30/03/2023";
        String report = "Eu " +name+ ", morando no endereço "+adress+", confirmo que recebi o salário de "+salary+", na data "+dateSalaryReceipt;

        System.out.println(report);
    }
}
