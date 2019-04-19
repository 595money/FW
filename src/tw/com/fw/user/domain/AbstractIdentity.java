package tw.com.fw.user.domain;

import java.sql.SQLException;
import tw.com.fw.dano.model.ICystal;
import tw.com.fw.permission.model.IPermission;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-30 19:53:25,Created by PigMiLK</li>
 *          <li>0.2.0 2019-03-30 Refactor class name ,Modified by PigMiLK</li>
 *          <li>0.3.0 2019-04-14 Refactor class name ,Modified by PigMiLK</li>
 *          </ul>
 * @since 0.3.0
 * @author PigMiLK
 */
public abstract class AbstractIdentity implements ICystal {
  protected String account;
  protected String email;
  protected String name;
  protected String password;
  protected boolean isAdministrator;
  protected IPermission permission;


  public AbstractIdentity() {
    account = "";
    name = "";
    email = "";
    password = "";
    isAdministrator = false;
  }

  public AbstractIdentity(String userAcct, String userPwd) throws SQLException {
    this.account = userAcct;
    this.password = userPwd;
    this.checkPermission();
  }

  /**
   * @return the account
   */
  public String getAccount() {
    return account;
  }

  /**
   * @param account the account to set
   */
  public void setAccount(String userAcct) {
    this.account = userAcct;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String userEmail) {
    this.email = userEmail;
  }

  /**
   * @return the isAdministrator
   */
  public boolean isAdministrator() {
    return isAdministrator;
  }

  /**
   * @param isAdministrator the isAdministrator to set
   */
  public void setAdministrator(boolean isAdmin) {
    this.isAdministrator = isAdmin;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String userName) {
    this.name = userName;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @return the permission
   */
  public IPermission getPermission() {
    return permission;
  }

  /**
   * @param permission the permission to set
   */
  public void setPermission(IPermission permission) {
    this.permission = permission;
  };

  /**
   * @param password the password to set
   */
  public void setPassword(String userPwd) {
    this.password = userPwd;
  }


  @Override
  public String toString() {
    return getAccount();
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
    AbstractIdentity u = (AbstractIdentity) obj;
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
   * 
   * @param
   * @return
   * @throws SQLException
   * @version
   *          <ul>
   *          <li>0.1.0 2019-03-31 23:08:19,Created by PigMiLK</li>
   *          </ul>
   * @since 0.1.0
   * @author PigMiLK
   */
  public void checkPermission() throws SQLException {
    permission.loadPermission();
  }
}
