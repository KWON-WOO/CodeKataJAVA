import java.util.Scanner;
public class Main {
    static int[][] field;      //배열크기는 농장 크기를, 값은 양배추 유무를 나타냄.
    static int row, col;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;          //지렁이 수
        int num;            //총 갯수
        int x, y;
        int[][] point;

        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            col = sc.nextInt();
            row = sc.nextInt();
            num = sc.nextInt();
            count = 0;
            field = new int[row][col];
            point = new int[num][];

            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    field[j][k] = 0;   //배추유무값 초기화. 찾아보니 Arrays.fill(field,0)으로도 대체 가능하다고 함.
                }
            }

            for (int j = 0; j < num; j++) {
                x = sc.nextInt();
                y = sc.nextInt();
                field[y][x] = 1;
                point[j] = new int[2];
                point[j][0] = y;
                point[j][1] = x;
            }
            for (int j = 0; j < num; j++) {
                if (field[point[j][0]][point[j][1]] == 1) {
                    count++;
                    solutionSearch(point[j]);
                }
            }
            System.out.println(count);
        }
    }
    public static void solutionSearch(int[] p) {
        int visit[][] = {
                {-1, 0},    //위 체크
                {1, 0},     //아래 체크
                {0, -1},    //왼쪽 체크
                {0, 1}};    //오른쪽 체크
        int y = p[0];
        int x = p[1];

        if (field[y][x] == 1) {
            field[y][x] = 2;
            for (int i = 0; i < 4; i++) {
                int searchY = y + visit[i][0];
                int searchX = x + visit[i][1];

                if (searchX >= 0 && searchX < col && searchY >= 0 && searchY < row) {
                    if (field[searchY][searchX] == 1) {
                        solutionSearch(new int[]{searchY, searchX});
                    }
                }
            }
        }
    }
}