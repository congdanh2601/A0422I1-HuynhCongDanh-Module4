package codegym.vn.phone_manager.repository;

import codegym.vn.phone_manager.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone, Long> {
}
