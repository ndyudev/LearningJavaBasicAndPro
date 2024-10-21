package chapter6;

public class SinhVienCoKhi extends SinhVien{
	private String skill;

	public SinhVienCoKhi(String skill,String id, String name, double price, double tax) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.skill = skill;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub
		
	}
	
	
}
