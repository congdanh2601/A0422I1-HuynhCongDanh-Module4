package codegym.vn.service;

import codegym.vn.bean.Product;
import codegym.vn.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;
    @Override
    public List<Product> showAll() {
        return repository.showAll();
    }

    @Override
    public void createOrUpdate(Product product) {
        repository.createOrUpdate(product);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Product viewDetail(int id) {
        return repository.viewDetail(id);
    }

    @Override
    public List<Product> findByName(String input) {
        return repository.findByName(input);
    }
}
