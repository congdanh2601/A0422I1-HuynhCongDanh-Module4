package codegym.vn.repository;

import codegym.vn.bean.UsdToVnd;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    static Map<String, String> vocabularies = new HashMap<>();
    static {
        vocabularies.put("hello", "Xin chào");
        vocabularies.put("umbrella", "Cái dù");
        vocabularies.put("sun", "Mặt trời");
        vocabularies.put("moon", "Mặt trăng");
        vocabularies.put("power", "Năng lượng");
    }
    @Override
    public String translate(String eng) {
        if(vocabularies.containsKey(eng)) {
            return vocabularies.get(eng);
        } else return "Không tìm thấy từ";
    }
}
