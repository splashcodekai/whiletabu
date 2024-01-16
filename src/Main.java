import java.util.*;
public class Main {
    public static void main(String[] args) {
        int cont=0;
        System.out.println("Deseja tabular algum numero:(RESPONDA COM SIM OU NAO)");
        Scanner j=new Scanner(System.in);
        Scanner n=new Scanner(System.in);
        String res=j.nextLine();

        if(res.equalsIgnoreCase("SIM")) {
            System.out.println("Digite o numero que deseja tabular:");
            int num = n.nextInt();

            while (cont <= 10) {
                System.out.println(cont + " X " + num + " = " + cont * num);
                cont++;


            }
        }

    }
}