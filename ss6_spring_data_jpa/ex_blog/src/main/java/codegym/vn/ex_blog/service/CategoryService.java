package codegym.vn.ex_blog.service;

import codegym.vn.ex_blog.bean.Category;
import codegym.vn.ex_blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements IService<Category> {
    private ICategoryRepository repository;
    @Autowired
    public CategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Category category) {
        repository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Category findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Category> findAllByCategory_Id(int id) {
        return null;
    }
}
