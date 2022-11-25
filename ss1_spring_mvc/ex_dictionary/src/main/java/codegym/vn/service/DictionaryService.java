package codegym.vn.service;

import codegym.vn.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    IDictionaryRepository repository;

    @Override
    public String translate(String eng) {
        return repository.translate(eng);
    }
}
