package julnarot;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("Sayinh");
        return "Hello " + name;
    }
    @Override
    public String goodBye() {
        System.out.println("bye!");
        return "GoodBye";
    }

}
