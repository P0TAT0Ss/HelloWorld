package per.han;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import per.han.MainApp.Talk;
import per.han.PO.User;
import per.han.PO.config;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = config.class)
public class tests {

    @Autowired
    private User user;

    @Test
    public void testSpring() {
        System.out.println(user.toString());
    }

    @Test
    public void testTalk(){
        System.out.println(Talk.result("你好啊"));
    }
}
