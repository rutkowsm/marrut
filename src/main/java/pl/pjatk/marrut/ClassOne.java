package pl.pjatk.marrut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassOne {

    public ClassOne() {
        System.out.println("First class");
    }

    public void printOne() {
        System.out.println("First print");
    }

    public void firstMethod(){
        System.out.println("Class One First Method");
    }

}
