package src.Ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
    public static void main(String[] args) {
        String[][] mails = new String[1000][3];

        // 메일 데이터 초기화
        for (int i = 0; i < mails.length; i++) {
            mails[i][0] = "admin@my.com";
            mails[i][1] = "member" + i + "@my.com";
            mails[i][2] = "신상품 입고";
        }

        // 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 작업 실행
        for (int i = 0; i < 1000; i++) {
            final int idx = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    String from = mails[idx][0];
                    String to = mails[idx][1];
                    String content = mails[idx][2];
                    System.out.println(thread.getName() + " " + from + " => " + to + " : " + content);
                }
            });
        }

        // 스레드 풀 종료
        executorService.shutdown();
    }
}
