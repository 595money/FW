package tw.com.fw.temple.model;

import tw.com.fw.constant.domain.Text;
import tw.com.fw.role.domain.Knight;
import tw.com.fw.role.domain.Novice;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-04-15 00:19:40,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public class RoleTemple extends AbstractTemple {

  @Override
  protected ICrystal pinchCrystal(String prayer) {
    // TODO 1.進行data持久化
    // TODO 1.1 使用DAO物件進行存取
    // TODO 2.switch role
    // TODO 3.return role

    // TODO 方便測試先寫死
    if (Text.ROLE_KNIGHT.equals(prayer)) {
      return new Knight();
    }
    if (Text.ROLE_KNIGHT.equals(prayer)) {
      return new Novice();
    }
    return null;
  }
}


