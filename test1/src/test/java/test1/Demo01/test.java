package test1.Demo01;

import org.junit.Test;

public class test {

    @Test
    public void testIntegration() {
        boolean b = Integrator.Integration
                ("C:/Users/Administrator/Videos/15277733","C:/Users/Administrator/Videos/ShapeOfVoice.flv");
        System.out.println(b);
    }
}
