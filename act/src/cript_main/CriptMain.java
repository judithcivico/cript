package cript_main;

import java.util.Scanner;

import cript_object.CriptObject;

public class CriptMain {

	public static void main(String[] args) {
		
		CriptObject cript = new CriptObject();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Benvingut!");
		System.out.println("Quin algorisme vols utilitzar?");
		System.out.println("1 - Algorisme Cesar");
		System.out.println("2 - Algorisme de xifrat monoalfabetic");
		System.out.println("3 - Algorisme de xifrat polialfabetic");
		int algorisme =scan.nextInt();
		
		if (algorisme == 1) {
			System.out.println("Que vols fer?");
			System.out.println("1 - Xifrar");
			System.out.println("2 - Desxifrar");
			int opcio =scan.nextInt();
			
			if(opcio == 1) {
				Scanner scc = new Scanner(System.in);
				System.out.println("Introdueix el missatge: ");
				String mensaje = scc.nextLine();
				System.out.print("Introdueix el codi: ");
				int codigo =scc.nextInt();
				
				System.out.println("Missatge xifrat: " + cript.cifradoCesar(mensaje, codigo));
			}
			else if(opcio == 2) {
				Scanner sdc = new Scanner(System.in);
				System.out.println("Introdueix el missatge: ");
				String mensaje = sdc.nextLine();
				System.out.print("Introdueix el codi: ");
				int codigo =sdc.nextInt();
				
				System.out.println("Missatge desxifrat: " + cript.descifradoCesar(mensaje, codigo));
			}
			else {
				System.out.println("Introdueix un numero valid");
			}
		}
		else if(algorisme == 2) {
			System.out.println("Que vols fer?");
			System.out.println("1 - Xifrar");
			System.out.println("2 - Desxifrar");
			int opcio =scan.nextInt();
			
			if(opcio == 1) {
				Scanner scm = new Scanner(System.in);
				System.out.println("Introdueix el missatge: ");
				String mensaje = scm.nextLine();
				System.out.print("Introdueix la clau: ");
				String clave =scm.nextLine();
				
				System.out.println("Missatge xifrat: " + cript.cifradoMonoalfabetico(mensaje, clave));
			}
			else if(opcio == 2) {
				Scanner sdm = new Scanner(System.in);
				System.out.println("Introdueix el missatge: ");
				String mensaje = sdm.nextLine();
				System.out.print("Introdueix la clau: ");
				String clave =sdm.nextLine();
				
				System.out.println("Missatge desxifrat: " + cript.descifradoMonoalfabetico(mensaje, clave));
			}
			else {
				System.out.println("Introdueix un numero valid");
			}
		}
		else if(algorisme == 3) {
			System.out.println("Que vols fer?");
			System.out.println("1 - Xifrar");
			System.out.println("2 - Desxifrar");
			int opcio =scan.nextInt();
			
			if(opcio == 1) {
				Scanner scn = new Scanner(System.in);
				System.out.println("Introdueix el missatge: ");
				String mensaje = scn.nextLine();
				System.out.print("Introdueix la primera clau: ");
				String clave1 =scn.nextLine();
				System.out.print("Introdueix la segona clau: ");
				String clave2 =scn.nextLine();
			
				
				System.out.println("Missatge xifrat: " + cript.cifradoPolialfabetico(mensaje, clave1, clave2));
			}
			else if(opcio == 2) {
				Scanner sdn = new Scanner(System.in);
				System.out.println("Introdueix el missatge: ");
				String mensaje = sdn.nextLine();
				System.out.print("Introdueix la primera clau: ");
				String clave1 =sdn.nextLine();
				System.out.print("Introdueix la segona clau: ");
				String clave2 =sdn.nextLine();
				
				
				System.out.println("Missatge desxifrat: " + cript.descifradoPolialfabetico(mensaje, clave1, clave2));
			}
			else {
				System.out.println("Introdueix un numero valid");
			}
		}
		else {
			System.out.println("Introdueix un numero valid");
		}
	}
}
