package bjwl.service.impl;

import bjwl.pojo.Tconce;
import bjwl.service.TConceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TConceServiceImpl implements TConceService {
    @Override
    public List<Tconce> selectTconecByUserID(int UserID) {
        return null;
    }
}
