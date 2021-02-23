package service.Impl;

import org.springframework.stereotype.Service;
import service.ConvertService;

@Service
public class ConvertServiceImpl implements ConvertService {

    @Override
    public double convert(double money) {
        return money * 23000;
    }
}
