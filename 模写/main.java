/* 苗字と名前
 * arrループ　1,2,3,5,7,8,144
 * 偶数を出力
 */
public class Masin{
  public static void main(String[] args){

    String firstName="边";
    String lastName="伯贤";

    System.out.println(getName(firstName,lastName));
    System.out.println();

    int [] arr = {1,2,3,5,7,8,11,14};
    
    for (int  number : arr){
      isEven(number);
    }
  }

  public static String getName(String firstName,String lastName);{
  return lastName + firstName;
  }

  public static int isEven (int num){
    if (num % 2 == 0){
      System.out.println(num + "は奇数です。");
    }
  }
}