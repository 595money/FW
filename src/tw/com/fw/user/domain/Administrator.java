/**
 * 
 */
package tw.com.fw.user.domain;

import tw.com.fw.permission.domain.AdminstractPemissionImp;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-30 19:58:48,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public class Administrator extends AbstractIdentity {

  public Administrator() {
    this.setAdministrator(true);
    // TODO Maybe stmt can use dynamic string ?
    this.setPermission(new AdminstractPemissionImp());
  }
}
