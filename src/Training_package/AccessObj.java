package Training_package;

public class AccessObj {
	
	// 접근제한자 
	public int p = 3;   // public: 모든 접근 허용
	protected int p2 = 4; 	 // protected: 같은 패키지 허용 or 다른 패키지는 상속 받아야 허용
	private int p3 = 5;   // private: 자기 자신만 접근 가능
	int p4 = 6;  // default: 자기 자신과 같은 패키지 내에서 사용 가능
	
	
		


}
