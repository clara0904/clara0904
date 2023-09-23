package questao1;
public class Main{
    public static void main(String[]args){
        Animal a1,a2,a3;
		a1 = new Peixe("Dourado",2.5,"Agua Doce");
		a2 = new Cachorro("Mike",5.2,"Golden Retrivier");
		a3 = new Peixe("Estrelado",1.6,"Agua salgada");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
    }
}