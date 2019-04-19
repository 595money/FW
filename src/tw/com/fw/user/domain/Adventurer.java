/**
 * 
 */
package tw.com.fw.user.domain;
import tw.com.fw.permission.domain.AdventurerPemissionImp;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-31 16:03:22,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public class Adventurer extends AbstractIdentity {

  public Adventurer() {
    this.setAdministrator(true);
    //TODO Maybe stmt can use dynamic string ?
    this.setPermission(new AdventurerPemissionImp());
  }
}
