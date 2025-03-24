public class MaquinaLavar {

    private boolean clean = true;
	
	private int agua = 30;
	
	private int shampoo = 10;
	
	private Pet pet;

   	
    //Dar banho no pet
	public void darBanho{
		if(this.pet == null) {
			System.out.println("Coloque pet na máquina para iniciar o banho.");
            return;
		}

        else{
            this.agua -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
            System.out.println("O pet " + pet.getName() + " está limpo.");
        }
	}

    //Abastecer com água
    public void adicionarAgua(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        else if(water <=28){
            water +=2;
        }
        
        else{
            System.out.println("A capacidade de água da máquina está em 29l, só poderá ser abastecida após a próxima lavagem");
            return;
        }
    }

    //Abastecer com Shampoo - ver como limitar os 10 na soma
    public void adicionarShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        else if(water <=8){
            shampoo +=2;
        }
        
        else{
            System.out.println("A capacidade de shampoo da máquina está em 9l, só poderá ser abastecida após a próxima lavagem");
            return;
        }
    }

    //Verificar nível Água
    public int getAgua() {
        return agua;
    }

    //Verificar nível Shampoo
    public int getShampoo() {
        return shampoo;
    }

    //Verificar se tem pet na máquina
    public boolean verificarPetNaMaquina(){
        return pet != null;
    }

    //Colocar pet na maquina
    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja. Para colocar o pet é necessário limpá-la.");
            return;
        }
        
        if(verificarPetNaMaquina()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina.");
            return;
        }
        
        this.pet = pet;
    }

    //Retirar pet da maquina
    public void retirarPet(){
        this.clean = this.pet.isClean();

        this.pet = null;
       
    }

    public void limparMaquina(){
        this.agua -= 3;
        this.shampoo -= 1;
        this.clean = true;

        System.out.println("A máquina foi lavada e está limpa.");
    }
}
