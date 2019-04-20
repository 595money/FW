/**
 * 
 */
package tw.com.fw.temple.model;

import tw.com.fw.temple.model.ICrystal;

/**
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-31 23:35:43,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public abstract class AbstractTemple {
  public final ICrystal create(String prayer) {

    return pinchCrystal(prayer);
  }

  protected abstract ICrystal pinchCrystal(String prayer);
}
