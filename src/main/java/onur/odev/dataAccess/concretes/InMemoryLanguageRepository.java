package onur.odev.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import onur.odev.dataAccess.abstracts.ILanguageRepository;
import onur.odev.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository implements ILanguageRepository {

	List<Language> languages;
		
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"Python"));
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	
}
