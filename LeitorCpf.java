import java.util.Scanner;
import java.util.Locale;

public class LeitorCpf{
	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);
		
		String[] cpf = new String[3];
		String[] cpfLast = new String[2];

                //continue a solucao
        System.out.println("Digite seu CPF:");
		cpf = sc.nextLine().split("\\.",3);
		cpfLast = cpf[2].split("-");
		
		for(int i=0;i<2;i++){
			System.out.printf("%s\n",cpf[i]);
		}
		for(int i=0;i<cpfLast.length;i++){
			System.out.printf("%s\n",cpfLast[i]);
		}
    
		
    
		sc.close();
	}
}
