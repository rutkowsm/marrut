package pl.pjatk.marrut;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClassThree {

    public ClassThree(ApplicationContext applicationContext) {
        ClassOne one = applicationContext.getBean("classOne", ClassOne.class);
        ClassTwo two = applicationContext.getBean("classTwo", ClassTwo.class);
        one.firstMethod();
        two.secondMethod();
    }



//    private ApplicationContext applicationContext;
//
//    public classThree(classOne classOne, classTwo classTwo){
//        Object classOneName = applicationContext.getBean("Class One", classOne);
//        System.out.println(classOneName);
//        Object classTwoName = applicationContext.getBean("Class Two", classTwo);
//        System.out.println(classTwoName);
//    }


}
