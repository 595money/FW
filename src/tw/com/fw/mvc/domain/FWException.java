package tw.com.fw.mvc.domain;

public class FWException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * 
   * @param
   * @version
   *          <ul>
   *          <li>0.1.0 2019-04-14 23:39:32,Created by PigMiLK</li>
   *          </ul>
   * @since 0.1.0
   * @author PigMiLK
   */
  public FWException() {}

  /**
   * 
   * @param
   * @version
   *          <ul>
   *          <li>0.1.0 2019-04-14 23:39:36,Created by PigMiLK</li>
   *          </ul>
   * @since 0.1.0
   * @author PigMiLK
   */
  public FWException(String msg) {
    super(msg);

  }

  /**
   * 
   * @param
   * @version
   *          <ul>
   *          <li>0.1.0 2019-04-14 23:39:41,Created by PigMiLK</li>
   *          </ul>
   * @since 0.1.0
   * @author PigMiLK
   */
  public FWException(String message, Throwable cause) {
    super(message, cause);
  }
}
