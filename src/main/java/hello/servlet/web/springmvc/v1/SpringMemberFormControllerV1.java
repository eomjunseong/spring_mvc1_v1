package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//case1
//@Component
//@RequestMapping --> 됨

//case2
//@RequestMapping --> + main에 @Bean 으로 등록해주면 --> ㅇㅇ
/*
@Bean
SpringMemberFormControllerV1 springMemberFormControllerV1(){
    return new SpringMemberFormControllerV1();
}
*/

@Controller
public class SpringMemberFormControllerV1 {
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}