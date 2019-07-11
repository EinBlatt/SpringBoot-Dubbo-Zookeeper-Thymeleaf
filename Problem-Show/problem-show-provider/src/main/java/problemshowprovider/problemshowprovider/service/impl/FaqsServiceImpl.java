package problemshowprovider.problemshowprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.einblatt.problem.domain.Faqs;
import com.einblatt.problem.service.FaqsService;
import org.springframework.stereotype.Component;
import problemshowprovider.problemshowprovider.dao.FaqsMapper;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = FaqsService.class)
public class FaqsServiceImpl implements FaqsService {

    @Resource
    private FaqsMapper faqsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Faqs record) {
        return 0;
    }

    @Override
    public int insertSelective(Faqs record) {
        return 0;
    }

    @Override
    public Faqs selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Faqs record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Faqs record) {
        return 0;
    }

    @Override
    public List<Faqs> getFaqsList() {
        return faqsMapper.getFaqsList();
    }

    @Override
    public List<Faqs> getFaqListByMainKey(String mainkey) {
        return null;
    }
}
