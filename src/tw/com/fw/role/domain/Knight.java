/**
 * 
 */
package tw.com.fw.role.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-30 19:57:21,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
@Component
public class Knight extends AbstractRole {
  // private String level;
  // private String strength;
  // private String dexterity;
  // private String intelligence;
  // private String vitality;
  // private String agility;
  // private String wisdom;
  // private String magic;
  @Override
  public void inborn() {
    String lv = getLevel();
    setStrength(lv);
    setDexterity(lv);
    setIntelligence(lv);
    setVitality(lv);
    setAgility(lv);
    setWisdom(lv);
    setMagic(lv);
  }

  @Override
  public void setStrength(String lv) {
    Double strength = Double.parseDouble(lv);
    strength = strength + strength * 0.5;
    Integer realStr = strength.intValue();
    super.setStrength(realStr.toString());
  };

  @Override
  public void acquired() {
    // TODO Auto-generated method stub

  }

  @Override
  public String toString() {
    return "I'm Knight";
  }

}
