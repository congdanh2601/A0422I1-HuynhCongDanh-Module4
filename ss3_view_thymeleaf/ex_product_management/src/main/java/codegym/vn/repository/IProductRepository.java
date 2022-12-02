package codegym.vn.repository;

import codegym.vn.bean.Product;

import java.util.List;
import java.util.Map;

public interface IProductRepository {
    List<Product> showAll();
    void createOrUpdate(Product product);
    void delete(int id);
    Product viewDetail(int id);
    List<Product> findByName(String input);
}
