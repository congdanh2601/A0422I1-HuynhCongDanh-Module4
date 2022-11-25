package codegym.vn.service;

import codegym.vn.bean.UsdToVnd;
import codegym.vn.repository.IConvertorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertorService implements IConvertorService {
    @Autowired
    IConvertorRepository repository;

    @Override
    public float convert(float usd) {
        return repository.convert(usd);
    }
}
