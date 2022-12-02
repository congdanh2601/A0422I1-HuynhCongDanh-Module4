package codegym.vn.service;

import codegym.vn.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAll();
    void createOrUpdate(Product product);
    void delete(int id);
    Product viewDetail(int id);
    List<Product> findByName(String input);
}
