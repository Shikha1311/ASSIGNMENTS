package Stream_Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class News {
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public String getComment() {
		return comment;
	}

	@Override
	public String toString() {
		return newsId + " " + postedByUser + " " + commentByUser + " " + comment;
	}

}

public class Assignment5Q2 {
	public static News maxComments(List<News> news) {
		return (News);

	}

	public static int budgetCount(List<News> news) {
		return 0;
	}

	public static String maxCommentsByUser(List<News> news) {
		return "";
	}

	public static Map<String, Integer> sortMaxCommentsByUser(List<News> news) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		return m;
	}

	public static void main(String[] args) {
		List<News> l = new ArrayList<News>();
		l.add(new News(1, "Ram", "Ram1", "budget is very low"));
		l.add(new News(2, "Sam", "Sam1", "some new topic now"));
		l.add(new News(3, "Tam", "Ram1", "new bugget is now given"));
		l.add(new News(4, "Gam", "Ram1", "Nice4"));
		l.add(new News(3, "Lam", "Ram1", "Nice5"));
		System.out.println(Assignment5Q2.maxComments(l));
		System.out.println(Assignment5Q2.budgetCount(l));
		System.out.println(Assignment5Q2.maxCommentsByUser(l));
		System.out.println(Assignment5Q2.budgetCount(l));
	}
}