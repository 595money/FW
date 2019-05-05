/**
 * 
 */
package tw.com.fw.user.domain;

import org.springframework.stereotype.Component;
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
@Component
public class Administrator extends AbstractIdentity {

  public Administrator() {
    this.setAdministrator(true);
    // TODO Maybe stmt can use dynamic string ?
    this.setPermission(new AdminstractPemissionImp());
  }
  @Override
  public String toString() {
  return "I'm Administrator";  
  }
}
