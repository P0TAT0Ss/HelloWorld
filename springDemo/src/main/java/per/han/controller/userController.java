package per.han.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("LogIn")
public class userController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal
            (HttpServletRequest request, HttpServletResponse response) throws Exception {

        return null;
    }
}
