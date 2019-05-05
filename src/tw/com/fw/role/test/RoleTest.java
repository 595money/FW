package tw.com.fw.role.test;

import tw.com.fw.role.domain.Knight;

/**
 * 
 * @version <ul> 
 *              <li>0.1.0 2019-04-21 18:08:29,Created by PigMiLK</li>
 *          </ul> 
 * @since 0.1.0
 * @author PigMiLK
 */
public class RoleTest {
  /**
   * 
   * @param args
   * @return void
   * @since 2019-03-30 18:41:32
   * @version 0.1.0
   * @author PigMiLK
   */
  public static void main(String[] args) {
    Knight k = new Knight();
    k.setLevel("20");
    k.inborn();
    System.out.println(k.getStrength());
  }
}
