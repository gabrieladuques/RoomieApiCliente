package br.com.java.senac.roomie.cliente.roomie.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidationCpf implements ConstraintValidator<Cpf, String> {

	private final int[] tamanho_CPF = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

	@Override
	public boolean isValid(String cpf, ConstraintValidatorContext context) {

		String apenasDigitos = cpf.replaceAll("\\D", "");

		if ((apenasDigitos == null) || (apenasDigitos.length() != 11) || apenasDigitos.equals("00000000000")
				|| apenasDigitos.equals("11111111111") || apenasDigitos.equals("22222222222")
				|| apenasDigitos.equals("33333333333") || apenasDigitos.equals("44444444444")
				|| apenasDigitos.equals("55555555555") || apenasDigitos.equals("66666666666")
				|| apenasDigitos.equals("77777777777") || apenasDigitos.equals("88888888888")
				|| apenasDigitos.equals("99999999999")) {
			return false;
		}

		Integer digito1 = calcularDigito(apenasDigitos.substring(0, 9), tamanho_CPF);
		Integer digito2 = calcularDigito(apenasDigitos.substring(0, 9) + digito1, tamanho_CPF);

		return apenasDigitos.equals(apenasDigitos.substring(0, 9) + digito1.toString() + digito2.toString());
	}

	private int calcularDigito(String str, int[] peso) {
		int soma = 0;
		for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
			digito = Integer.parseInt(str.substring(indice, indice + 1));
			soma += digito * peso[peso.length - str.length() + indice];
		}
		soma = 11 - soma % 11;
		return soma > 9 ? 0 : soma;
	}

}
