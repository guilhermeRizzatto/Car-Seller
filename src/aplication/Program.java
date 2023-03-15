package aplication;

import java.util.Scanner;
import entities.Car;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car focus,hb20,corolla,civic;				
		
		System.out.println("Qual carro deseja comprar?");
		System.out.println();
		System.out.println("Focus, Valor: R$90.000,00");
		System.out.println("HB20, Valor: R$100.000,00");
		System.out.println("Corolla, Valor: R$125.000,00");
		System.out.println("Civic, Valor: R$140.000,00");
			
			System.out.print("Qual carro deseja comprar?");
			String model = sc.nextLine().toLowerCase();
			switch (model) {
			case "focus":
				focus = new Car("Focus",90_000);
				System.out.print("Deseja negociar por ele? s/n ");
				char yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
						double value = sc.nextDouble();
						focus.negotiation(value);					
				}
				else {
					System.out.print("Você deseja financiar? s/n ");
					yesOrNo = sc.next().charAt(0);
					if (yesOrNo == 's') {
						System.out.print("Quantos anos quer financiar? ");
						int years = sc.nextInt();
						focus.financing(years);
					}
					else {
						System.out.println("Até mais!");
					}
				}
				break;
			case "hb20":
				hb20 = new Car("HB20",100_000);
				System.out.print("Deseja negociar por ele? s/n");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
					double value = sc.nextDouble();
					hb20.negotiation(value);
				}
				else {
					System.out.print("Você deseja financiar? s/n ");
					yesOrNo = sc.next().charAt(0);
					if (yesOrNo == 's') {
						System.out.print("Quantos anos quer financiar? ");
						int years = sc.nextInt();
						hb20.financing(years);
					}
					else {
						System.out.println("Até mais!");
					}
				}
				break;
			case "corolla":
				corolla = new Car("Corolla",125_000);
				System.out.print("Deseja negociar por ele? s/n");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
					double value = sc.nextDouble();
					corolla.negotiation(value);
				}
				else {
					System.out.print("Você deseja financiar? s/n ");
					yesOrNo = sc.next().charAt(0);
					if (yesOrNo == 's') {
						System.out.print("Quantos anos quer financiar? ");
						int years = sc.nextInt();
						corolla.financing(years);
					}
					else {
						System.out.println("Até mais!");
					}
				}
				break;
			case "civic":
				civic = new Car("Civic",140_000);
				System.out.print("Deseja negociar por ele? s/n");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
					double value = sc.nextDouble();
					civic.negotiation(value);
				}
				else {
					System.out.print("Você deseja financiar? s/n ");
					yesOrNo = sc.next().charAt(0);
					if (yesOrNo == 's') {
						System.out.print("Quantos anos quer financiar? ");
						int years = sc.nextInt();
						civic.financing(years);
					}
					else {
						System.out.println("Até mais!");
					}
				}
				break;
			}			
			sc.close();
	}
}
