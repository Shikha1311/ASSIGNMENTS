import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {
public static void main(String[] args) {
	ApplicationContext Context=new ClassPathXmlApplicationContext("Question.xml");
	Question Q=(Question) Context.getBean("question");
	Q.questionAnswer();
 }
}
