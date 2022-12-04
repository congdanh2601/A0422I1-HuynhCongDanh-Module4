package codegym.vn.service;

import codegym.vn.bean.Setting;
import codegym.vn.repository.ISettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingService implements ISettingService {
    @Autowired
    ISettingRepository repository;

    @Override
    public void update(Setting setting) {
        repository.update(setting);
    }
}
