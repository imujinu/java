package src.Ch9;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        class Ok implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("OK버튼을 클릭했습니다.");
            }
        }

        btn.setClickListener(new Ok());

        btn.click();

        Button btnCancel = new Button();

        class Cancle implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Cancle 버튼을 클릭했습니다.");
            }
        }
        btnCancel.setClickListener(new Cancle());
        btnCancel.click();


    }
}
