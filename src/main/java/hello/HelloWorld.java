package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("This is DevOps Lab 4:done by Ranjan " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
