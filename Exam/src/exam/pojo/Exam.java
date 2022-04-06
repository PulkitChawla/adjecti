package exam.pojo;

public class Exam {

	private int examId;
	private String examName;
	private String examDesc;
	
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamDesc() {
		return examDesc;
	}
	public void setExamDesc(String examDesc) {
		this.examDesc = examDesc;
	}
	public Exam(int examId, String examName, String examDesc) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDesc = examDesc;
	}
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	
}
