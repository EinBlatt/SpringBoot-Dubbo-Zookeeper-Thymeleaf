package problemshowconsumer.problemshowconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.einblatt.problem.domain.Faqs;
import com.einblatt.problem.service.FaqsService;
import com.einblatt.problem.vo.FaqsReturnWebVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


    @Reference
    private FaqsService faqsService;

    @RequestMapping("/gomain")
    public String gomain(){
        return "haha";
    }

    @RequestMapping("/main")
    @ResponseBody
    public String sihello(ModelAndView modelAndView){
        List<Faqs> faqsServices=faqsService.getFaqsList();
        List<FaqsReturnWebVo> faqsReturnWebVos=new ArrayList<>();
        FaqsReturnWebVo f=null;
        for (Faqs service : faqsServices) {
            f=new FaqsReturnWebVo();
            BeanUtils.copyProperties(service,f);
            faqsReturnWebVos.add(f);
        }
        return JSON.toJSONString(faqsReturnWebVos);
    }


}
