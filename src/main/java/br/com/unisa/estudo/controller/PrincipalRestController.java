package br.com.unisa.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unisa.estudo.service.RetornoTextoService;

@RestController
@RequestMapping("/api/v01")
public class PrincipalRestController {

	@Autowired
	RetornoTextoService _retornoTextoService;

	@GetMapping("/texto/retornar/{texto}")
	public ResponseEntity<String> retornar(@PathVariable("texto") String texto) {

		return new ResponseEntity<String>(this._retornoTextoService.retornar(texto), HttpStatus.OK);
	}
}
