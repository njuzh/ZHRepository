import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld extends WebPage
{
	
       public HelloWorld()
       {
    	   	 Label a=new Label("message", "Hello World using Wicket!!");
              add(new Label("message", "Hello World using Wicket!!"));
       }
}