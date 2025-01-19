package src.Ch15;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> board = new ArrayList<>();

        board.add(new Board("제목 1", "내용1", "글쓴이1"));
        board.add(new Board("제목 2", "내용2", "글쓴이2"));
        board.add(new Board("제목 3", "내용3", "글쓴이3"));
        board.add(new Board("제목 4", "내용4", "글쓴이4"));
        board.add(new Board("제목 5", "내용5", "글쓴이5"));

        int size = board.size();
        System.out.println("총 객체 수 : " + size);

        Board board2 = board.get(2);
        System.out.println("2번째 객체 제목: " + board2.getSubject());

        System.out.println("모든 객체 제목:");
        for (int i = 0; i < board.size(); i++) {
            System.out.println(board.get(i).getSubject());
        }

        // 2번째, 3번째 객체 삭제
        board.remove(2); // 인덱스 2 삭제
        board.remove(2); // 삭제 후 인덱스가 재정렬되므로 다시 2를 삭제

        System.out.println("삭제 후 모든 객체 제목:");
        for (Board b : board) {
            System.out.println(b.getSubject());
        }
    }
}
