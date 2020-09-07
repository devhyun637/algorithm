package algorithm.backjoon.$2009;

import java.util.Scanner;

//테트로미노
public class Sol14500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        //1번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 3 < m) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
                    max = Math.max(sum, max);
                }
            }
        }

        //2번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 3 < n) {
                    int sum = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j];
                    max = Math.max(sum, max);
                }
            }
        }

        //3번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 1 < n && j + 1 < m) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //4번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 2 < n && j + 1 < m) {
                    int sum = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //5번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 2 < n && j + 1 < m) {
                    int sum = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 2][j];
                    max = Math.max(sum, max);
                }
            }
        }

        //6번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2];
                    max = Math.max(sum, max);
                }
            }
        }

        //7번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
                    max = Math.max(sum, max);
                }
            }
        }

        //8번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j + 2] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
                    max = Math.max(sum, max);
                }
            }
        }

        //9번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 < m && i + 2 < n) {
                    int sum = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //10번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 2 < n) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //11번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i + 1][j] + arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                    max = Math.max(sum, max);
                }
            }
        }

        //12번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 < m && i + 2 < n) {
                    int sum = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //13번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 < m && i + 2 < n) {
                    int sum = arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j];
                    max = Math.max(sum, max);
                }
            }
        }

        //14번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
                    max = Math.max(sum, max);
                }
            }
        }

        //15번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j + 2] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j];
                    max = Math.max(sum, max);
                }
            }
        }

        //16번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //17번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 2 < m && i + 1 < n) {
                    int sum = arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
                    max = Math.max(sum, max);
                }
            }
        }

        //18번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 < m && i + 2 < n) {
                    int sum = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 1][j + 1];
                    max = Math.max(sum, max);
                }
            }
        }

        //19번
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 < m && i + 2 < n) {
                    int sum = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 1][j];
                    max = Math.max(sum, max);
                }
            }
        }

        System.out.println(max);
    }
}
