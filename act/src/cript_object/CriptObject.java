package cript_object;
import java.io.IOException;

public class CriptObject {
	
	private String mensaje;
	private String mensajeModificado;
	private String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890?!.,_";
	private int codigo;
	private String alfabet;
		
	// --------------------------------------- ALGORISME CESAR --------------------------------------------
	
	public String cifradoCesar(String mensaje, int codigo){
		String mensajeModificado = "";			//missatge que sera modificat
		for (int i = 0; i < mensaje.length() ; i++) {			//funcio que mou les lletras del missatge
            for (int j = 0; j < letras.length(); j++) { 		//el numero de vegades que tingui el codi
                if (mensaje.charAt(i)==letras.charAt(j)) {
                	mensajeModificado+=letras.charAt((j+codigo)%letras.length());
                }
            }
		}
	return mensajeModificado;
	}
	
	public String descifradoCesar(String mensaje, int codigo){
		String mensajeModificado = "";
		for (int i = 0; i < mensaje.length() ; i++) {
            for (int j = 0; j < letras.length(); j++) {
                if (mensaje.charAt(i)==letras.charAt(j)) {
                	mensajeModificado+=letras.charAt((j-codigo)%letras.length());
                }
            }
		}
	return mensajeModificado;
    }
	
	// ----------------------------------- ALGORISME MONOALFABETIC ---------------------------------------
	
	public String cifradoMonoalfabetico(String mensaje, String clave){
		String mensajeModificado = "";
		int pos = 1; 
		int pos2 = 1; 
		
		char[] claveModificada = clave.toCharArray();
		
		//funcio per modificar la paraula clau i eliminar els caracters repetits
		for (int i = 1; i < clave.length(); i++) {
			int j; 
			for (j = 0; j < pos; ++j) { 
				if (claveModificada[i] == claveModificada[j]) { 
					break; 
				} 
			} if (j == pos) {
				claveModificada[pos] = claveModificada[i];		
				++pos; 
			} else {
				claveModificada[pos] = 0; 
				++pos; 
			} 
		} 
		System.out.println("Paraula clau: " + toString(claveModificada));
		
		char[] alfabetModificat = letras.toCharArray();
		
		//funcio per modificar l'abecedari i eliminar els caracters repetits
		for (int i = 1; i < toString(claveModificada).length(); i++) {
			int j; 
			for (j = 0; j < pos2; ++j) { 
				if (alfabetModificat[i] == alfabetModificat[j]) { 
					break; 
				} 
			} if (j == pos2) {
				alfabetModificat[pos2] = alfabetModificat[i]; 
				++pos2; 
			} else {
				alfabetModificat[pos2] = 0; 
				++pos2; 
			}
			alfabet = toString(claveModificada) + toString(alfabetModificat);	 //sumem la clau modificada i l'alfabet modificat
		} 
		System.out.println("Alfabet reordenat: " + alfabet);
		
		return mensajeModificado; 
	}
	
	public String descifradoMonoalfabetico(String mensaje, String clave){
		String mensajeModificado = "";
		int pos = 1; 
		char[] claveModificada = clave.toCharArray(); 
		
		//funcio per modificar la paraula clau i eliminar els caracters repetits
		for (int i = 1; i < clave.length(); i++) {
			int j; 
			for (j = 0; j < pos; ++j) { 
				if (claveModificada[i] == claveModificada[j]) { 
					break; 
				} 
			} if (j == pos) {
				claveModificada[pos] = claveModificada[i]; 
				++pos; 
			} else {
				claveModificada[pos] = 0; 
				++pos; 
			} 
		} 
		System.out.println("Paraula clau: " + toString(claveModificada));
		
		int pos2 = 1; 
		char[] alfabetModificat = letras.toCharArray();
		
		//funcio per modificar l'abecedari i eliminar els caracters repetits
		for (int i = 1; i < letras.length(); i++) {
			int j; 
			for (j = 0; j < pos2; ++j) { 
				if (alfabetModificat[i] == alfabetModificat[j]) { 
					break; 
				} 
			} if (j == pos2) {
				alfabetModificat[pos2] = alfabetModificat[i]; 
				++pos2; 
			} else {
				alfabetModificat[pos2] = 0; 
				++pos2; 
			} 
			alfabet = toString(claveModificada) + toString(alfabetModificat);	//sumem la clau modificada i l'alfabet modificat
		}                                                                                                
		System.out.println("Alfabet reordenat: " + alfabet);
		
		return mensajeModificado; 
	}
	
	
	// ------------------------------------- ALGORISME POLIALFABETIC ------------------------------------------
	
	public String cifradoPolialfabetico(String mensaje, String clave1, String clave2){
		String mensajeModificado = "";
		
		int pos = 1; 
		int pos2 = 1; 
		char[] claveModificada = clave1.toCharArray();
		
		//funcio per modificar la (primera) paraula clau i eliminar els caracters repetits
		for (int i = 1; i < clave1.length(); i++) {
			int j; 
			for (j = 0; j < pos; ++j) { 
				if (claveModificada[i] == claveModificada[j]) { 
					break; 
				} 
			} if (j == pos) {
				claveModificada[pos] = claveModificada[i];		
				++pos; 
			} else {
				claveModificada[pos] = 0; 
				++pos; 
			} 
		} 
		System.out.println("Paraula clau 1: " + toString(claveModificada));
		
		char[] claveModificada2 = clave2.toCharArray();
		
		//funcio per modificar la (segona) paraula clau i eliminar els caracters repetits
		for (int i = 1; i < clave2.length(); i++) {
			int j; 
			for (j = 0; j < pos2; ++j) { 
				if (claveModificada2[i] == claveModificada2[j]) { 
					break; 
				} 
			} if (j == pos2) {
				claveModificada2[pos2] = claveModificada2[i];		
				++pos2; 
			} else {
				claveModificada2[pos2] = 0; 
				++pos2; 
			} 
		} 
		System.out.println("Paraula clau 2: " + toString(claveModificada2));
		
		int pos3 = 1; 
		char[] alfabetModificat = letras.toCharArray();
		
		//funcio per modificar l'abecedari 1 i eliminar els caracters repetits
		for (int i = 1; i < letras.length(); i++) {
			int j; 
			for (j = 0; j < pos3; ++j) { 
				if (alfabetModificat[i] == alfabetModificat[j]) { 
					break; 
				} 
			} if (j == pos3) {
				alfabetModificat[pos3] = alfabetModificat[i]; 
				++pos3; 
			} else {
				alfabetModificat[pos3] = 0; 
				++pos3; 
			} 
			alfabet = toString(claveModificada) + toString(alfabetModificat);	//sumem la clau modificada i l'alfabet modificat
		}                                                                                                
		System.out.println("Alfabet reordenat 1: " + alfabet);
		
		int pos4 = 1; 
		char[] alfabetModificat2 = letras.toCharArray();
		
		//funcio per modificar l'abecedari 1 i eliminar els caracters repetits
		for (int i = 1; i < letras.length(); i++) {
			int j; 
			for (j = 0; j < pos4; ++j) { 
				if (alfabetModificat2[i] == alfabetModificat2[j]) { 
					break; 
				} 
			} if (j == pos4) {
				alfabetModificat2[pos4] = alfabetModificat2[i]; 
				++pos4; 
			} else {
				alfabetModificat2[pos4] = 0; 
				++pos4; 
			} 
			alfabet = toString(claveModificada2) + toString(alfabetModificat2);	//sumem la clau modificada i l'alfabet modificat
		}                                                                                                
		System.out.println("Alfabet reordenat 2: " + alfabet);
		
		
	return mensajeModificado;
	}
		
	public String descifradoPolialfabetico(String mensaje, String clave1, String clave2){
		String mensajeModificado = "";
		
		int pos = 1; 
		int pos2 = 1; 
		char[] claveModificada = clave1.toCharArray();
		
		//funcio per modificar la (primera) paraula clau i eliminar els caracters repetits
		for (int i = 1; i < clave1.length(); i++) {
			int j; 
			for (j = 0; j < pos; ++j) { 
				if (claveModificada[i] == claveModificada[j]) { 
					break; 
				} 
			} if (j == pos) {
				claveModificada[pos] = claveModificada[i];		
				++pos; 
			} else {
				claveModificada[pos] = 0; 
				++pos; 
			} 
		} 
		System.out.println("Paraula clau 1: " + toString(claveModificada));
		
		char[] claveModificada2 = clave2.toCharArray();
		
		//funcio per modificar la (segona) paraula clau i eliminar els caracters repetits
		for (int i = 1; i < clave2.length(); i++) {
			int j; 
			for (j = 0; j < pos2; ++j) { 
				if (claveModificada2[i] == claveModificada2[j]) { 
					break; 
				} 
			} if (j == pos2) {
				claveModificada2[pos2] = claveModificada2[i];		
				++pos2; 
			} else {
				claveModificada2[pos2] = 0; 
				++pos2; 
			} 
		} 
		System.out.println("Paraula clau 2: " + toString(claveModificada2));
		
		int pos3 = 1; 
		char[] alfabetModificat = letras.toCharArray();
		
		//funcio per modificar l'abecedari 1 i eliminar els caracters repetits
		for (int i = 1; i < letras.length(); i++) {
			int j; 
			for (j = 0; j < pos3; ++j) { 
				if (alfabetModificat[i] == alfabetModificat[j]) { 
					break; 
				} 
			} if (j == pos3) {
				alfabetModificat[pos3] = alfabetModificat[i]; 
				++pos3; 
			} else {
				alfabetModificat[pos3] = 0; 
				++pos3; 
			} 
			alfabet = toString(claveModificada) + toString(alfabetModificat);	//sumem la clau modificada i l'alfabet modificat
		}                                                                                                
		System.out.println("Alfabet reordenat 1: " + alfabet);
		
		int pos4 = 1; 
		char[] alfabetModificat2 = letras.toCharArray();
		
		//funcio per modificar l'abecedari 1 i eliminar els caracters repetits
		for (int i = 1; i < letras.length(); i++) {
			int j; 
			for (j = 0; j < pos4; ++j) { 
				if (alfabetModificat2[i] == alfabetModificat2[j]) { 
					break; 
				} 
			} if (j == pos4) {
				alfabetModificat2[pos4] = alfabetModificat2[i]; 
				++pos4; 
			} else {
				alfabetModificat2[pos4] = 0; 
				++pos4; 
			} 
			alfabet = toString(claveModificada2) + toString(alfabetModificat2);	//sumem la clau modificada i l'alfabet modificat
		}                                                                                                
		System.out.println("Alfabet reordenat 2: " + alfabet);
		
	return mensajeModificado;
	}
	
	public static String toString(char[] letras) { //passar de char a string
		StringBuilder sb = new StringBuilder(letras.length);
		for (char c : letras) {
			if (c != 0) {
				sb.append(c); 
				}
			} 
		return sb.toString(); 	
	}
	
}
