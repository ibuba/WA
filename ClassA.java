package lab1.main;

import lab1.main.annotations.MyAutowired;
import lab1.main.annotations.MyBean;

@MyBean
public class ClassA {
    @MyAutowired
   private  ClassB bClass;

public ClassA()
{}
    


}
