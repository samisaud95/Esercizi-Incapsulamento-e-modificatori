
public class Main {
    public static void main(String[] args) {
   Auto auto1= new Auto(4,"EAD876","TOYOTA","YARIS");
   Auto auto2= new Auto(12,"ABC126","NISSAN","MICRA");

        System.out.println("La Informazione Cerca la Auto è");
        System.out.println("La Cilindrata : " + auto1.getCilindrata());
        System.out.println("La Targa : " + auto1.getTarga());
        System.out.println("La Marca : " + auto1.getMarca());
        System.out.println("The model :" +auto1.getModelo());

        System.out.println("La Informazione cerca la Auto è");
        System.out.println("La Cilindrata : " + auto2.getCilindrata());
        System.out.println("La Targa : " + auto2.getTarga());
        System.out.println("La Marca : " + auto2.getMarca());
        System.out.println("The model :" +auto2.getModelo());


    }
}