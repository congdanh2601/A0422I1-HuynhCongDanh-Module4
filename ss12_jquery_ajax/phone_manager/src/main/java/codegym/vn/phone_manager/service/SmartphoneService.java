package codegym.vn.phone_manager.service;

import codegym.vn.phone_manager.entity.Smartphone;
import codegym.vn.phone_manager.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneService implements ISmartphoneService {
    private ISmartphoneRepository repository;

    @Autowired
    public SmartphoneService(ISmartphoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Smartphone> findAll() {
        return repository.findAll();
    }

    @Override
    public Smartphone findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return repository.save(smartPhone);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
