package codegym.vn.repository;

import codegym.vn.bean.Setting;
import org.springframework.stereotype.Repository;

@Repository
public class SettingRepository implements ISettingRepository {
    Setting setting;

    @Override
    public void update(Setting setting) {
        this.setting = setting;
    }
}
