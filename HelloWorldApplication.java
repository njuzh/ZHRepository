
import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {

       protected void init() {
       }

       public Class getHomePage() {
              return HelloWorld.class;
       }
}