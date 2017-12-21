package br.com.assertsistemas.util;

import org.apache.commons.lang.math.NumberUtils;
import java.util.Map;
import java.util.HashMap;

public class Validador {
	
	
	private int initialSize = 16;
	private double loadFactor = 0.75;
	private double sizeToRehash = initialSize * loadFactor;
	private Map<String, String> uf = new HashMap<String, String>();
	
	
	public Validador() {
		// TODO Auto-generated constructor stub
			uf.put("A",new String("V1"));
		    uf.put("B", new String("V2"));
		    uf.put( "C", new String( "V3" ));
		    uf.put( "D", new String( "V4" ));
		    uf.put( "E", new String( "V5" ));
		    uf.put( "F", new String( "V6" ));
		    uf.put( "G", new String( "V7" ));
		    uf.put( "H", new String( "V8" ));
		    uf.put( "I", new String( "V9" ));
		    uf.put( "J", new String( "V10" ));
		    uf.put( "K", new String( "V11" ));          
		    uf.put( "L", new String( "V12" ));
		    uf.put( "M", new String( "V1" ));
		    uf.put( "N", new String( "V2" ));
		    uf.put( "O", new String( "V3" ));
		    uf.put( "P", new String( "V4" ));
		    uf.put( "Q", new String( "V5" ));
		    uf.put( "R", new String( "V6" ));
		    uf.put( "S", new String( "V7" ));
		    uf.put( "T", new String( "V8" ));
		    uf.put( "U", new String( "V9" ));
		    uf.put( "V", new String( "V10" ));
		    uf.put( "W", new String( "V12" ));
		    uf.put( "X", new String( "V11" ));  
		    uf.put( "Y", new String( "V12" ));
		    uf.put( "Z", new String( "V12" ));
		    
		    System.out.println(uf.size());
		    
	} 
	

	public static boolean validAlfabeto(String valor) {
		if (valor == null || valor.isEmpty() == true) {
			return false;
		}

		char[] numeros = "1,2,3,4,5,6,7,8,9,0".toCharArray();
		char[] value = valor.toCharArray();

		for (int i = 0; i < value.length; i++) {
			char caracter = value[i];

			for (int j = 0; j < numeros.length; j++) {
				if (caracter == numeros[j]) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean validIntLong(String i) {
		return NumberUtils.isNumber(i);
	}

	public static boolean validChar(String i) {
		int tamanho = i.length();
		String genero = i.toLowerCase();

		if (tamanho == 1) {
			if (genero.contains("m") || genero.contains("f")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean validDouble(String i) {
		try {
			String parseValue = i.replace("\\,", ".");
			Double.valueOf(parseValue);
			if (parseValue.contains(".")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return (false);
		}

	}
}
