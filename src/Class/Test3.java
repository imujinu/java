package src.Class;

public class Test3 {
    String id;
    String password;

    public Test3(){}



    void login(String id, String password){
        if(id== "hong" && password == "12345"){
            this.id = id;
            this.password = password;
            System.out.println("로그인되었습니다.");
        }else{
            System.out.println("로그인 정보가 올바르지 않습니다.");
        }
    return;
    }

    void logout(){
        System.out.println(this.id+"님이 로그아웃 되었습니다.");
    }


}
