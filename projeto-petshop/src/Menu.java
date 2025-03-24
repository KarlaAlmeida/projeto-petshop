import java.util.Scanner;

public class Menu {

    private final static Scanner scanner = new Scanner(System.in);

    private final static MaquinaLavar maquinaLavar = new MaquinaLavar();

    public static void main(String[] args) {
        var opcao = -1;

        do{
           System.out.println("===Escolha uma das opções:==="); 
           System.out.println("1 - Dar banho no pet."); 
           System.out.println("2 - Abastecer máquina com água."); 
           System.out.println("3 - Abastecer máquina com shampoo."); 
           System.out.println("4 - Verificar nível da água."); 
           System.out.println("5 - Verificar nível do shampoo."); 
           System.out.println("6 - Verificar se tem Pet no banho."); 
           System.out.println("7 - Colocar Pet na máquina"); 
           System.out.println("8 - Retirar Pet da máquina."); 
           System.out.println("9 - Limpar a máquina."); 
           System.out.println("0 - Sair.");

           option = scanner.nextInt();

           switch (option) {
            
            case 7 -> colocarPetNaMaquina();
                
           }
            

        } while (option != 0);

    }

    public static void colocarPetNaMaquina(){
        var name = "";
        while (name.isEmpty()) {
            System.out.println("Informe o nome do pet.");
            name = scanner.next();
        }
        var pet = new Pet(name);
        maquinaLavar.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }
}
