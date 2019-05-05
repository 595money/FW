package tw.com.fw.dano.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.com.fw.permission.model.IPermission;
import tw.com.fw.role.domain.AbstractRole;
import tw.com.fw.temple.model.ICrystal;
import tw.com.fw.user.domain.AbstractIdentity;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-04-01 00:03:56,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
@Component
public class Dano implements ICrystal{
  @Autowired
  AbstractIdentity identity;
  @Autowired
  AbstractRole role;
//  @Autowired
//  IPermission Permission;

  /**
   * Non-parameterized Constructor
   * 
   * @version
   *          <ul>
   *          <li>0.1.0 2019-04-10 23:08:46,Created by PigMiLK</li>
   *          </ul>
   * @since 0.1.0
   * @author PigMiLK
   */
  public Dano() {
    super();
  }

//  /**
//   * 
//   * @param AbstractIdentity
//   * @param AbstractRole
//   * @version
//   *          <ul>
//   *          <li>0.1.0 2019-04-10 23:06:11,Created by PigMiLK</li>
//   *          </ul>
//   * @since 0.1.0
//   * @author PigMiLK
//   */
//  public Dano(AbstractIdentity identity, AbstractRole role) {
//    super();
//    this.identity = identity;
//    this.role = role;
//  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Dano [identity=");
    builder.append(identity);
    builder.append(", role=");
    builder.append(role);
//    builder.append(", Permission=");
//    builder.append(Permission);
    builder.append(", getClass()=");
    builder.append(getClass());
    builder.append(", hashCode()=");
    builder.append(hashCode());
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
