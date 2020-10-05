package spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("/test/{example}")
    public void test(@PathVariable(required = false) String example, HttpServletResponse response) throws IOException {

        response.getOutputStream().write(example.getBytes());

    }

}
