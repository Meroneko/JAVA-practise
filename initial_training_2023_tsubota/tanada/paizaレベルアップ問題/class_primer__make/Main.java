import java.util.*;
public class Main {
    static class User {
        public String nickname;
        public int old;
        public String birth;
        public String state;
        User(String nickname, int old, String birth, String state) {
            this.nickname = nickname;
            this.old = old;
            this.birth = birth;
            this.state = state;
        }
        void hello() {
            System.out.println("User{");
            System.out.println("nickname : " + this.nickname);
            System.out.println("old : " + this.old);
            System.out.println("birth : " + this.birth);
            System.out.println("state : " + this.state);
            System.out.println("}");
        }
    }
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int users_count = sc.nextInt();
        
        for (int i = 0; i < users_count; i++) {
            User user = new User(sc.next(), sc.nextInt(), sc.next(), sc.next());
            user.hello();
        }
    }
}