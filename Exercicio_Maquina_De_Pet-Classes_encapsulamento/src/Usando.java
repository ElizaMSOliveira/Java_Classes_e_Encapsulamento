import java.util.Scanner;

public class Usando {
    private final static Scanner  scanner = new Scanner(System.in);
    private final static PetMachine  petMachine = new PetMachine();

    public static void main(String[] args) {
            // PARA TRATAR ESPAÇOS EM BRANCO USADO EM NOME COMPOSTOS
        scanner.useDelimiter("\\n");
        var option = -1;

        do{
            System.out.println("Escolha A Sua Opção");
            System.out.println("1 - Dar Banho no Pet");
            System.out.println("2 - Abastecer a Máquina com Água ");
            System.out.println("3 - Abastecer a Máquina com Shampoo");
            System.out.println("4 - Verificar Água da Máquina");
            System.out.println("5 - Verificar Schampoo da Máquina");
            System.out.println("6 - Verificar se tem Pet no Banho");
            System.out.println("7 - Colocar Pet na Máquina");
            System.out.println("8 - Ratirar Pet da Máquina");
            System.out.println("9 - Limpar a Máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> setPetInMachibe();
                case 2 -> setWater();
                case 3-> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> getPetFromMachine();
                case 9 -> cleanPetMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }

        }while(true);
    }

    private static void setPetInMachibe() {
        petMachine.takeShower();
    }

    private static void setWater() {
        //System.out.println("Tentando Adicionar Água na Máquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        //System.out.println("Tentando Colocar Shampoo na Máquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amaount = petMachine.getWater();
        System.out.println("A Máquina está no Momento com "+amaount+" Litro(s) de Água");
    }

    private static void verifyShampoo() {
        var amaount = petMachine.getShampoo();
        System.out.println("A Máquina está no momento com "+amaount +"Litro(s) de Shampoo" );
    }

    private static void checkIfHasPetMachine() {
        var hasPet =  petMachine.hasPet();
        //USANDO O ELVIS OPERATION
        System.out.println(hasPet ? "Tem Pet Na Máquina ": "Não há Pet na Máquina");
    }

    public static void setPetInPetMachine(){
        var name ="";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o Nome do Pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O Pet "+ pet.getName() +" Foi Adicionado na Máquina");
    }
    public static void getPetFromMachine(){
        System.out.println("Tentando remover Pet");
        petMachine.removePet();//TAMEBÉM POSSO FAZER A CHAMADA DESSE METODO DIRETO NO CASE 8
    }
    public static void cleanPetMachine(){
        petMachine.wash();
    }
}
//RESOLVER O PROBLEMA DE NÃO PODER REMOVER SE NÃO TIVER
