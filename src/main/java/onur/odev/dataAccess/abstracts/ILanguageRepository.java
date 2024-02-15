package onur.odev.dataAccess.abstracts;

import java.util.List;

import onur.odev.entities.concretes.Language;

public interface ILanguageRepository {
	List<Language> getAll();

}
