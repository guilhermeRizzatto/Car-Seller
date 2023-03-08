package aplication;

import java.util.Scanner;
import entities.Car;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car focus,hb20,corolla,civic;
		focus = new Car("Focus",90_000);
		hb20 = new Car("HB20",100_000);
		corolla = new Car("Corolla",125_000);
		civic = new Car("Civic",140_000);
		
		System.out.println("Qual carro deseja comprar?");
		System.out.println();
		System.out.println(focus);
		System.out.println(hb20);
		System.out.println(corolla);
		System.out.println(civic);
			
			System.out.print("Qual carro deseja comprar?");
			String model = sc.nextLine();
			switch (model) {
			case "focus":
				System.out.print("Deseja negociar por ele?");
				char yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
						double value = sc.nextDouble();
						focus.negotiation(value);					
				}
				else {
					System.out.print("Você deseja financiar? ");
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
				System.out.print("Deseja negociar por ele?");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
					double value = sc.nextDouble();
					hb20.negotiation(value);
				}
				else {
					System.out.print("Você deseja financiar? ");
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
				System.out.print("Deseja negociar por ele?");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
					double value = sc.nextDouble();
					corolla.negotiation(value);
				}
				else {
					System.out.print("Você deseja financiar? ");
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
				System.out.print("Deseja negociar por ele?");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 's') {
					System.out.println("Por quanto deseja comprar?");
					double value = sc.nextDouble();
					civic.negotiation(value);
				}
				else {
					System.out.print("Você deseja financiar? ");
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
