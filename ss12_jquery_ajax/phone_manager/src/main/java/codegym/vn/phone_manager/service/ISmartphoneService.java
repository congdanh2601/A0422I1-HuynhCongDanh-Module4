package codegym.vn.phone_manager.service;

import codegym.vn.phone_manager.entity.Smartphone;

import java.util.List;

public interface ISmartphoneService {
    List<Smartphone> findAll();
    Smartphone findById(Long id);
    Smartphone save(Smartphone smartPhone);
    void delete(Long id);
}
