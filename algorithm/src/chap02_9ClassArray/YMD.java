package chap02_9ClassArray;

public class YMD { // 클래스 안에 메소드 중가로 닫지 말자
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, }; // 윤년
	int y;
	int m;
	int d;
	int days;

	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	public int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	public void dayOfYear() {
		if(12<m){
			m-=12;
			y++;
			
		}
		else if(mdays[isLeap(y)][m - 1]<d){
			 d -= mdays[isLeap(y)][m-1];
			m++;
		}else if(d<=0){
			d +=mdays[isLeap(y)][m-1];
			m--;
		}else if(m<=0){
			m+=12;
			y--;
		}
		else
			return ;
		dayOfYear();
		
	}
	public void afterDay(int day){
		d+=day;
		dayOfYear();
	}
	public void beforeDay(int day){
		d-=day;
		dayOfYear();
	}
}
