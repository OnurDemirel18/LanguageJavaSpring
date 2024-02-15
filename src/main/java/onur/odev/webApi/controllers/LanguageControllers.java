package onur.odev.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onur.odev.business.abstracts.ILanguageService;
import onur.odev.entities.concretes.Language;
@RestController
@RequestMapping("/api/languages")
public class LanguageControllers implements ILanguageService {

	private ILanguageService languageService;
	@Autowired
	public LanguageControllers(ILanguageService languageService) {
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageService.getAll();
	}
	
}
