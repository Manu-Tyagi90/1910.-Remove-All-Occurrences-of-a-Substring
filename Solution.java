public class Solution{
  public static String rmOccurences(String str, String part) {
    StringBuffer sb = new StringBuffer(str);
    while(sb.indexOf(part)!=-1){
      int index = sb.indexOf(part);
      sb.delete(index, index + part.length());
    }
    return sb;
  }
}
