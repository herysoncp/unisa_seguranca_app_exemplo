package br.com.unisa.estudo.service.provider;

import org.springframework.stereotype.Service;

import br.com.unisa.estudo.service.RetornoTextoService;

@Service
public class RetornoTextoServiceProvider implements RetornoTextoService {

	@Override
	public String retornar(String texto) {

		return texto;
	}
}
