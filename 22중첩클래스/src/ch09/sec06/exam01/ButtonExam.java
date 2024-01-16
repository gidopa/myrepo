package ch09.sec06.exam01;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();

		btnOk.setClickListener(new OkListner());
		btnOk.click();

		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("버튼 누른거 취소");
			}

		}
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
	}

}

class Button {
	public static interface ClickListener {
		void onClick();
	}

	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}
}

class OkListner implements Button.ClickListener {

	@Override
	public void onClick() {
		System.out.println("Ok 버튼을 클릭했으니 선물 줌");
	}
}
