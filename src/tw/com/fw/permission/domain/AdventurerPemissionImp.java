/**
 * 
 */
package tw.com.fw.permission.domain;

import java.util.ArrayList;
import tw.com.fw.permission.model.IPermission;

/**
 * @version <ul> 
 *              <li>0.1.0 2019-03-31 18:06:43,Created by PigMiLK</li>
 *          </ul> 
 * @since 0.1.0
 * @author PigMiLK
 */
public class AdventurerPemissionImp implements IPermission {
  private ArrayList<String> permissions;

  public void loadPermission() {
    // 1.Init permissionList
    permissions = new ArrayList<String>();
    // 2.Query permission table
    // TODO unwork Query permission table
    // 3.Using for loop
    // TODO unwork Using for loop
    permissions.add("武器店使用權");
    permissions.add("防具店使用權");
    permissions.add("寵物店使用權");
   
  }
}
