package tw.com.fw.dano.model;

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
  protected ICystal createProduct(String str) {
    // TODO 1.進行data持久化
    // TODO 1.1 使用DAO物件進行存取
    // TODO 2.switch role
    // TODO 3.return role

    // TODO 方便測試先寫死
    if ("KNIGHT".equals(str)) {
      return new Knight();
    } else {
      return new Novice();
    }
  }

}
