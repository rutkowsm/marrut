package pl.pjatk.marrut;

import org.springframework.stereotype.Component;

@Component
public class ClassTwo {

    public ClassTwo(ClassOne printOne) {
        System.out.println("Second class");
        printOne.printOne();
    }

    public void secondMethod(){
        System.out.println("Class Two Second Method");
    }
}
