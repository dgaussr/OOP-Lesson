import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //a)metodos para registro de cada pais
        Country country1 = new Country("bolivia", "sucre", 1099000);
        Country country2 = new Country("brasil", "brasilia", 8516000);
        Country country3 = new Country("argentina", "buenos aires", 2780000);

        //b)get informações do pais
        System.out.println("Pais: " + country1.getName() + "\nCapital: " + country1.getCapital() + "\nDimensão: " + country1.getDimension() + "km²");


        //c)verifica se um pais é igual ao outro//
        Scanner sc = new Scanner(System.in);
        System.out.println(country1.equals(country2));
        System.out.println(country1.equals(country3));


        //d)insere fronteiras
        System.out.println("\ndigite o numero de fronteiras");
        int num = sc.nextInt();
        for (int i = 0; i<num; i++){
            System.out.println("Digite o nome do pais " + (i+1));
            String input = sc.next();
            if (input.equals(country1.getName())){
                System.out.println("Nome do pais fronteira inserido igual o nome do pais, insira novamente...\n");
                i--;
            }else{
                country1.add_border(input.toLowerCase());
            }
        }



        //e)mostra a lista de paises fronteiras
        System.out.println("\npaises fronteiras do pais " + country1.getName());
        country1.listarPaises();

        //adiciona as fronteiras do country3 e country2 automaticamente apenas para comparacao
        country3.add_border("paraguai");
        country3.add_border("uruguai");
        country3.add_border("bolivia");
        country3.add_border("chile");

        country2.add_border("bolivia");
        country2.add_border("paraguai");
        country2.add_border("uruguai");
        country2.add_border("argentina");
        country2.add_border("peru");
        country2.add_border("colombia");


        //f)compara e retorna as fronteiras que são iguais entre os dois paises
        country1.border_comparison(country3);

        country1.border_comparison(country2);

        country2.border_comparison(country3);

    }


}
