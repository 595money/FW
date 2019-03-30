/**
 * 
 */
package tw.com.fw.user.domain;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-30 19:53:25,Created by PigMiLK</li>
 *          <li>0.2.0 2019-03-30 Refactor class name ,Modified by PigMiLK</li>
 *          </ul>
 * @since 0.2.0
 * @author PigMiLK
 */
public class AbstractUser {
  private String name;
  private String password;
  private String email;

  public AbstractUser() {
    name = "";
    password = "";
    email = "";
  }

  @Override
  public String toString() {
    return "";
  }

  /**
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (null == obj) {
      return false;
    }
    // 比較者與被比較者不得帶空值
    AbstractUser u = (AbstractUser) obj;
    if ("".equals(u.name) || "".equals(u.password) || "".equals(u.email)) {
      return false;
    }
    if ("".equals(this.name) || "".equals(this.password) || "".equals(this.email)) {
      return false;
    }
    if (name != null ? !name.equals(u.name) : true) {
      return false;
    }
    if (password != null ? !password.equals(u.password) : true) {
      return false;
    }
    return true;
  }

  /**
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() + 1214 : 0;
    result = 31 * result + (password != null ? password.hashCode() + 1214 : 0);
    return result;
  }
}
