package pl.pjatk.marrut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class classTwo {

    public classTwo(classOne printOne) {
        System.out.println("Class Two");
        printOne.printOne();
    }
}
