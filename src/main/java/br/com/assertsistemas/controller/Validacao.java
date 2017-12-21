package br.com.assertsistemas.controller;

import javax.swing.JOptionPane;

import org.apache.commons.lang.math.NumberUtils;

public class Validacao {

	public static void main(String[] args) {

	}

	public boolean validRacaDoenca(String valor) {
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

	public boolean validIntLong(String i) {
		return NumberUtils.isNumber(i);
	}

	public boolean validChar(String i) {
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

	public boolean validDouble(String i) {
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

	public String repeticao(String key) {
		int tentando = 0;
		while (tentando < 5) {
			tentando++;
			JOptionPane.showInputDialog("Erro no sistema.");
			String sair = JOptionPane.showInputDialog("Sair do programa? S/N");
			sair = sair.toUpperCase();

			if (sair.contains("S")) {
				System.exit(0);
			}

			String parse = this.MetodoInputMessage(key);
			if (parse != null && parse.isEmpty() == false) {
				return parse;
			}

			if (tentando == 4) {
				JOptionPane.showInputDialog("Você tem apenas mais uma tentativa antes do bloqueio.");

				if (tentando == 5) {
					JOptionPane.showInputDialog("Sistema encerrado.");
					System.exit(0);
				}
			}
		}
		return null;
	}

	private String MetodoInputMessage(String key) {
		String valor = "";
		switch (key) {
		case "categoria":
			valor = JOptionPane.showInputDialog("Insira a categoria:");
			if (validRacaDoenca(valor)) {
				return valor;
			}
		case "modelo":
			valor = JOptionPane.showInputDialog("Insira o modelo:");
			if (validRacaDoenca(valor)) {
				return valor;
			}
			break;
		case "combustivel":
			valor = JOptionPane.showInputDialog("Insira o tipo de combustível:");
			if (validChar(valor)) {
				return valor;
			}
			break;
		case "ano":
			valor = JOptionPane.showInputDialog("Insira o ano do veículo:");
			if (validIntLong(valor)) {
				return valor;
			}
			break;
		case "renavam":
			valor = JOptionPane.showInputDialog("Insira o número renavam:");
			if (validRacaDoenca(valor)) {
				return valor;
			}
			break;
		case "placa":
			valor = JOptionPane.showInputDialog("Insira a placa do veículo:");
			if (validDouble(valor)) {
				return valor;
			}
			break;
		case "consumo":
			valor = JOptionPane.showInputDialog("Insira o consumo em quilômetros / litro do veículo:");
			if (validDouble(valor)) {
			}
			break;
		case "quilometragem":
			valor = JOptionPane.showInputDialog("Insira a quilometragem que o veículo possui:");
			if (validDouble(valor)) {
			}
			break;
		default:
		}
		return null;
	}

}
