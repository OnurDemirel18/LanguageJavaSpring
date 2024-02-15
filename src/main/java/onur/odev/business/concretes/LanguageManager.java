package onur.odev.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onur.odev.business.abstracts.ILanguageService;
import onur.odev.dataAccess.abstracts.ILanguageRepository;
import onur.odev.entities.concretes.Language;
@Service
public class LanguageManager implements ILanguageService {
	
	private ILanguageRepository languageRepository;
	@Autowired
	public LanguageManager(ILanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return this.languageRepository.getAll();
	}
	

	
	

}
