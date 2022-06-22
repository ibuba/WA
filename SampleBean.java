package lab1.main;

import lab1.main.annotations.MyAutowired;
import lab1.main.annotations.MyBean;

@MyBean
public class SampleBean {
    @MyAutowired
    private String name;
     @MyAutowired
    private String kal;
    private String nal;

    public static void main(String[] args) throws Exception {
        MyInjector myInjector=new MyInjector();
        myInjector.scanForBean();
        System.out.println(myInjector.getBean(SampleBean.class));
    }
}
