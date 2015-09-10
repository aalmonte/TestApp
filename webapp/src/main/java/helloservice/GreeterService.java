package helloservice;

import hello.Greeter;

public class GreeterService {
  public String hello() {
    return new Greeter().sayHello();
  }
}