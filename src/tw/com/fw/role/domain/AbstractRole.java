/**
 * 
 */
package tw.com.fw.role.domain;

import tw.com.fw.temple.model.ICrystal;

/**
 * 
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-30 22:43:31,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public abstract class AbstractRole implements ICrystal {

  private String strength;
  private String dexterity;
  private String intelligence;
  private String vitality;
  private String agility;
  private String wisdom;
  private String magic;

  /**
   * @return the strength
   */
  public String getStrength() {
    return strength;
  }

  /**
   * @param strength the strength to set
   */
  public void setStrength(String strength) {
    this.strength = strength;
  }

  /**
   * @return the dexterity
   */
  public String getDexterity() {
    return dexterity;
  }

  /**
   * @param dexterity the dexterity to set
   */
  public void setDexterity(String dexterity) {
    this.dexterity = dexterity;
  }

  /**
   * @return the intelligence
   */
  public String getIntelligence() {
    return intelligence;
  }

  /**
   * @param intelligence the intelligence to set
   */
  public void setIntelligence(String intelligence) {
    this.intelligence = intelligence;
  }

  /**
   * @return the vitality
   */
  public String getVitality() {
    return vitality;
  }

  /**
   * @param vitality the vitality to set
   */
  public void setVitality(String vitality) {
    this.vitality = vitality;
  }

  /**
   * @return the agility
   */
  public String getAgility() {
    return agility;
  }

  /**
   * @param agility the agility to set
   */
  public void setAgility(String agility) {
    this.agility = agility;
  }

  /**
   * @return the wisdom
   */
  public String getWisdom() {
    return wisdom;
  }

  /**
   * @param wisdom the wisdom to set
   */
  public void setWisdom(String wisdom) {
    this.wisdom = wisdom;
  }

  /**
   * @return the magic
   */
  public String getMagic() {
    return magic;
  }

  /**
   * @param magic the magic to set
   */
  public void setMagic(String magic) {
    this.magic = magic;
  }

}
