package tw.com.fw.temple.model;

import tw.com.fw.constant.domain.Text;
import tw.com.fw.user.domain.Administrator;
import tw.com.fw.user.domain.Adventurer;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-04-15 00:14:56,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public class IdentityTemple extends AbstractTemple {

  @Override
  protected ICrystal pinchCrystal(String prayer) {
    // TODO 1.進行data持久化
    // TODO 1.1 使用DAO物件進行存取
    // TODO 2.switch role
    // TODO 3.return role

    // TODO 方便測試先寫死
    if (Text.ID_ADMINISTRATOR.equals(prayer)) {
      return new Administrator();
    }

    if (Text.ID_ADVENTURER.equals(prayer)) {
      return new Adventurer();
    }
    return null;

  }

}
