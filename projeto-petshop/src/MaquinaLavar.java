public class MaquinaLavar {

    private boolean clean = true;
	
	private int agua = 30;
	
	private int shampoo = 10;
	
	private Pet pet;

   	
    //Dar banho no pet
	public void darBanho(){
		if(this.pet == null) {
			System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
		}

        if(this.agua < 10 || this.shampoo < 2){
            System.out.println("A Quantidade de água e/ou shampoo é insuficiente. Favor abastecer.");
            return;
        }
        
        this.agua -= 10;
        this.shampoo -= 2;
        //pet.setClean(true); não foi necessário essa definição.
        this.clean = false;
        System.out.println("O pet " + pet.getName() + " está limpo.");
                  
        }

    //Abastecer com água
    public void adicionarAgua(){
        if (agua == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        else if(agua <=28){
            agua +=2;
            System.out.println("Adicionado 2 litros de água na máquina. A capacidade agora é de " + getAgua());
        }
        
        else{
            System.out.println("A capacidade de água da máquina está em 29 litros, só poderá ser abastecida após a próxima lavagem");
            return;
        }
    }

    //Abastecer com Shampoo
    public void adicionarShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        else if(shampoo <=8){
            shampoo +=2;
            System.out.println("Adicionado 2 litros de shampoo na máquina. A capacidade agora é de " + getShampoo());
        }
        
        else{
            System.out.println("A capacidade de shampoo da máquina está em 9 litros, só poderá ser abastecida após a próxima lavagem");
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
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina."); 
    }

    //Retirar pet da maquina
    public void retirarPet(){
        if(pet == null){
            System.out.println("Não tem pet na máquina. Escolha outra opção.");
        }
        else{
            System.out.println("O pet " + this.pet.getName() +" foi retirado da máquina.");
            this.clean = this.pet.isClean();
            this.pet = null;
            
        }
        
       
    }

    public void limparMaquina(){
        if(verificarPetNaMaquina()){
            System.out.println("Tem um pet na máquina. Favor retirá-lo pra limpar a máquina.");
            return;
        }
        if(this.clean){
            System.out.println("A máquina já está limpa.");
            return;
        }
        if(this.agua < 3 || this.shampoo < 1){
            System.out.println("A Quantidade de água e/ou shampoo é insuficiente. Favor abastecer.");
            return;
        }
        else{
            this.agua -= 3;
            this.shampoo -= 1;
            this.clean = true;
            System.out.println("A máquina foi lavada e está limpa.");
        }
        
    }
}
