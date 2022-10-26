/**
 * バブルソート
 * チェックテスト-Java３章
 * ３１２７５
 * １２３５７と表示されるように
 */
public class Main {
  public static void main(String[] args) {
    /*
     * 問1
     * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
     */
    int[] data = { 3, 1, 2, 7, 5 };
    /*
     * 問2
     * 以下のfor文を完成させなさい
     */
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < data.length - 1; i++) {
      /* 各数字を定位置につかせる */
      for (int j = data.length - 1; j > i; j--) {
        /* 左右で大小比較させる */
        /*
         * 問3
         * 以下、配列の添字を入れてソートを完成させなさい
         */
        if (data[j - 1] > data[j]) {
          int box = data[j - 1];
          data[j - 1] = data[j];
          data[j] = box;
          /* 大小比較のシステムを作る */
        }
      }
    }
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
  }
}