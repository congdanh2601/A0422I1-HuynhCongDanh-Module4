package codegym.vn.repository;

import codegym.vn.bean.UsdToVnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ConvertorRepository implements IConvertorRepository {
    private UsdToVnd usdToVnd;
    @Override
    public float convert(float usd) {
        usdToVnd = new UsdToVnd(usd);
        return usdToVnd.getVnd();
    }
}
