package Training_package;

public class EnumExam {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";	
	
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.FEMALE;
		gender1= EnumExam.MALE;
		
		gender1 = "boy"; 
		// 데이터 type이 String이기만 하면 FEMALE, MALE 외의 문자 값들을 다 들어갈 수 있다는 문제 발생!
		// 그래서 아래에서 열거형을 사용
		
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		//gender 2 = "boy"; 에러 발생
	}

}

// 열거형(enum) : 특정 값만 가져다 사용해야 한다면 열거형 사용함
enum Gender{
	MALE, FEMALE
}
