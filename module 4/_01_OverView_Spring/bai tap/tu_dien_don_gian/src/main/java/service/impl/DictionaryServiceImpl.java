package service.impl;

import org.springframework.stereotype.Service;
import service.DictionaryService;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String translate(String text) {
        Map<String,String> list = new HashMap<>();
        list.put("book","sách");
        list.put("hello","xin chào");
        list.put("fire","lửa");
        list.put("water","nước");
        String result = "";
        for (String key : list.keySet()){
            if (text.equals(key)) {
                result = list.get(key);
                break;
            }

            else
                result = "Từ này mới quá từ điển cùi chưa được cập nhật!!";
        }
        return result;
    }
}
