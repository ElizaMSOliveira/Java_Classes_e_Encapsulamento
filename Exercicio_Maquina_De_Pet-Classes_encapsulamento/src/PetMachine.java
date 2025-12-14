public class PetMachine {

    private boolean clear = true;
    private int water = 30;
    private int shampoo = 10;

    private Pet pet;

    //FUNÇÕES(REGRA DE NEGÓCIO)

    public void takeShower(){
        if(this.pet == null){
            System.out.println("Coloque o Pet na Maquina para iniciar o banho");
            return;
        }
        this.water -=10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet "+pet.getName()+" Está limpo");
    }
    public void addWater(){
        if(water == 30){
            System.out.println("Não Abastecida! A Capacidade de Água no Máximo");
            return;
        }
        System.out.println("Maquina Abastecida");
        water += 2;
    }
    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("Não Abastecida! A Capacidade de Shampoo no Máximo");
            return;
        }
        System.out.println("Maquina Abastecida");
        shampoo += 2;

    }
    //VERIFICAR NIVÉL DE ÁGUA
    public int getWater() {
        return water;
    }
    //VERIFICAR NIVÉL DE SHAMPOO
    public int getShampoo() {
        return shampoo;
    }
    //VERIFICAR SE TEM PET NO BANHO
    public boolean hasPet(){
        //return pet != null;
        //OU
        if(pet != null){
            return true;
        }else{
            return false;
        }
    }
    // COLOCAR PET NA MAQUINA
    public void setPet(Pet pet) {
        if(!this.clear){
            System.out.println("A Máquina está Suja. Para colocar o Pet, Limpe a Maquina");
            return;
        }
        if(hasPet()){
            System.out.println("O Pet "+ this.pet.getName()+"Está Na Máquina Nesse Momento");
            return;
        }
        this.pet = pet;
    }
    //REMOVENDO O PET DA MÁQUINA
    public void removePet(){
        this.clear = this.pet.isClean();     // if(!this.pet.isClean()) {
         //   this.clear = false;
       // }
       // this.clear = this.pet.isClean();
        //System.out.println("O Pet "+ this.pet.getName()+ " Foi Retirado da Máquina e Está Limpo");
        this.pet = null;

    }
    //LIMPANDO A MÁQUINA
    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clear = false;
        System.out.println("Agora Você Limpou á Máquina Está Limpa");
    }

}
