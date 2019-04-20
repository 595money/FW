/**
 * 
 */
package tw.com.fw.mvc.test;

import tw.com.fw.dano.domain.Dano;
import tw.com.fw.role.domain.AbstractRole;
import tw.com.fw.role.domain.Knight;
import tw.com.fw.role.domain.Novice;
import tw.com.fw.temple.model.AbstractTemple;
import tw.com.fw.temple.model.ICrystal;
import tw.com.fw.temple.model.IdentityTemple;
import tw.com.fw.temple.model.RoleTemple;
import tw.com.fw.user.domain.AbstractIdentity;
import tw.com.fw.user.domain.Administrator;
import tw.com.fw.user.domain.Adventurer;


/**
 * @version
 *          <ul>
 *          <li>0.1.0 2019-03-31 16:28:05,Created by PigMiLK</li>
 *          </ul>
 * @since 0.1.0
 * @author PigMiLK
 */
public class TestMain {
  public static void main(String[] args) {
    Dano DanoT1 = new Dano();
    AbstractIdentity AdventurerT = new Adventurer();
    AbstractRole KnightT = new Knight();
    DanoT1 = new Dano(AdventurerT, KnightT);
    System.out.println(DanoT1.toString());
    Dano DanoT2 = new Dano();
    AbstractIdentity AdministratorT = new Administrator();
    AbstractRole NoviceT = new Novice();
    DanoT2 = new Dano(AdministratorT, NoviceT);
    System.out.println(DanoT2.toString());

    Dano DanoT3 = new Dano();
    AbstractTemple IdentityFactoryT = new IdentityTemple();
    AbstractTemple RoleFactoryT = new RoleTemple();
    ICrystal AbstractIdentityT = IdentityFactoryT.create("");
    ICrystal AbstractRoleT = RoleFactoryT.create("");
  }
}
