/**
 * 
 */
package tw.com.fw.permission.model;

import java.sql.SQLException;

/**
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-31 16:44:50,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public interface IPermission {
  /**
   * 1.Init retuen permissionList <br>
   * 2.Query permission table <br>
   * 3.PermissionList remove element <br>
   * 4.PermissionList add some element (specialization permission)<br>
   * 
   * @throws SQLException
   * @version
   *          <ul>
   *          <li>0.1.0 2019-03-31 19:04:26,Created by PigMiLK</li>
   *          </ul>
   * @since 0.1.0
   * @author PigMiLK
   * 
   */
  public void loadPermission() throws SQLException;

}
