import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	List<String> questionId;
	Set<String> question; 
	Map<Integer, String> answers;
	public List<String> getQuestionId() {
		return questionId;
	}
	public void setQuestionId(List<String> questionId) {
		this.questionId = questionId;
	}
	public Set<String> getQuestion() {
		return question;
	}
	public void setQuestion(Set<String> question) {
		this.question = question;
	}
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	public void questionAnswer()
	{
		System.out.println("Question No. : "+getQuestionId());
		System.out.println("Question : "+getQuestion());
		System.out.println("Answer : "+getAnswers());
	}
	
}
