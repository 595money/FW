/**
 * 
 */
package tw.com.fw.dano.model;


/**
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-31 23:35:43,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public abstract class AbstractTemple {
  public final ICystal create(String jarName) {

    return createProduct(jarName);
  }

  protected abstract ICystal createProduct(String str);
}
