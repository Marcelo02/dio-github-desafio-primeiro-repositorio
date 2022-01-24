import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Cria Scanner

        //Declarando Variaveis
        int mediaSalario = 10000;
        int mediaDependentes = 4;

        //Pega variaveis do usuario
        getInfo();

        //Checha se ha muitos dependentes e pouco salario
       boolean salarioBaixo = salarioMensal < mediaSalario;
       boolean muitosDependentes = quantidadeDependentes > mediaDependentes;

       boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        //Define se usuario recebe ou nao e printa a resposta.

        System.out.println("Recebe Auxilio? \n" + recebeAuxilio);

        //Quero fazer metodos ainda para pegar as quantidades

    }

    private static int getInfo() {
        System.out.println("Quanto voce recebe por mes?");
        int salarioMensal = scanner.nextInt();

        System.out.println("Quantos dependentes voce tem?");
        int quantidadeDependentes = scanner.nextInt();
        return int quantidadeDependetes
    }
}
