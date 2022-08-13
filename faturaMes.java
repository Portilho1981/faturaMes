package Portilho;

import java.util.Scanner;

public class faturaMes {

public static void main(String[] args) { 
	
		Scanner scan = new Scanner(System.in);
		int qtd;
		double[] fat;
		double soma = 0, media;
		
			
				
        System.out.print(" Quantas faturas serao digitadas? ");
		qtd = scan.nextInt();
		
		if (qtd >= 2) {
			
			fat = new double[qtd];
			
			for (int i =0 ; i < fat.length; i++) {
				
			System.out.println(" Digite a " + (i + 1) + " fatura :");
			fat[i] = scan.nextDouble();
			
			soma += fat[i];
		}	
			
			media = soma / qtd;
			
			System.out.println(" A Media do Faturamento e :  R$ " + media);
			
		}else {
			
			System.out.println(" Erro!! >=2 :");
		
		
			scan.close();
		}

	}

}
